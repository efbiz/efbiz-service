package org.efbiz.config;

import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@Component
@Primary
@EnableApolloConfig("TEST2.rabbitmq")
@EqualsAndHashCode(callSuper = false)
@Log4j2
@Data
@ConfigurationProperties(prefix = "spring.rabbitmq")
public class ApolloRabbitConfig extends RabbitProperties{
    
    private String host ;
    
    private int    port ;
    
    private String username;
    
    private String password;
    
    @PostConstruct
    private void init() {
        log.info("ConfigurationProperties rabbitmq -host: {},port: {}, userName: {}, password: {}", host,port,username, password);
    }
    
}
