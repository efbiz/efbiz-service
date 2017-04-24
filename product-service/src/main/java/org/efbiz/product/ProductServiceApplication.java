package org.efbiz.product;


import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.github.kristofa.brave.Brave;
import com.github.kristofa.brave.mysql.MySQLStatementInterceptorManagementBean;

import io.swagger.annotations.Api;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * User: Joni
 * Email: joni@efbiz.org
 * Date: 2017/3/29
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class ProductServiceApplication {

    @Bean
    public Docket docket() {
        ApiSelectorBuilder apiSelectorBuilder = new Docket(DocumentationType.SWAGGER_2).select();
        apiSelectorBuilder.apis(withClassAnnotation(Api.class));
        return apiSelectorBuilder
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfo("Product Service API Doc", "Product Service API Doc", "1.0", "https://github.com/efbiz/efbiz-service",
                        new Contact("Joni", "https://github.com/efbiz", "joni@efbiz.org"), null, null))
                .forCodeGeneration(true);
    }
    
    @Bean
    public MySQLStatementInterceptorManagementBean mysqlStatementInterceptorManagementBean(){
    	Brave brave = new Brave.Builder("productDao").build();
    	return new MySQLStatementInterceptorManagementBean(brave.clientTracer());
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
