package org.efbiz.config;

import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.efbiz.brave.MySQLStatementInterceptorManagementBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import zipkin.Span;
import zipkin.reporter.AsyncReporter;
import zipkin.reporter.Reporter;
import zipkin.reporter.Sender;
import zipkin.reporter.okhttp3.OkHttpSender;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.github.kristofa.brave.Brave;
import com.google.common.base.Strings;

@Component
@Primary
@EnableApolloConfig("TEST2.zipkin")
@Data
@EqualsAndHashCode(callSuper = false)
@ConfigurationProperties(prefix = "zipkin")
@Log4j2
public class ApolloZipkinConfig{
    
    private String  server;
    
    private Boolean enable;
    
    @Bean
    Sender sender() {
        String host = Strings.isNullOrEmpty(this.server)?"http://zipkin:9411":this.server ;
        return OkHttpSender.create(host +"/api/v1/spans");
    }
    
    @Bean
    Reporter<Span> reporter() {
        // 取消注释,日志打印span信息
        // return new LoggingReporter();
        
        return AsyncReporter.builder(sender()).build();
    }
    
    @Bean
    Brave brave() {
        return new Brave.Builder("brave-webmvc-example").reporter(reporter()).build();
    }
    
    @PostConstruct
    private void init() {
        log.info("ConfigurationProperties zipkinEnable : {},zipkinServer : {}", enable, server);
        if (Strings.isNullOrEmpty(server)) {
            this.server = "http://zipkin:9411";
        }
        if(enable == null){
            enable = false;
        }
    }
    @Bean
    public MySQLStatementInterceptorManagementBean mysqlStatementInterceptorManagementBean() {
        Brave brave = null;
        if (enable) {
            Sender sender = OkHttpSender.create(server + "/api/v1/spans");
            Reporter<Span> reporter = AsyncReporter.builder(sender).build();
            brave = new Brave.Builder().reporter(reporter).build();
        } else {
            brave = new Brave.Builder().build();
        }
        return new MySQLStatementInterceptorManagementBean(brave.clientTracer());
    }
}