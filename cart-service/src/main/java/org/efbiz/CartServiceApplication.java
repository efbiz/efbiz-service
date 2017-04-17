package org.efbiz;

import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;
import io.swagger.annotations.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

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
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
public class CartServiceApplication {

    @Bean
    public Docket docket() {
        ApiSelectorBuilder apiSelectorBuilder = new Docket(DocumentationType.SWAGGER_2).select();
        apiSelectorBuilder.apis(withClassAnnotation(Api.class));
        return apiSelectorBuilder
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfo("Cart Service API Doc", "Cart Service API Doc", "1.0", "https://github.com/efbiz/efbiz-netflix",
                        new Contact("Joni", "https://github.com/efbiz", "joni@efbiz.org"), null, null))
                .forCodeGeneration(true);
    }

    public static void main(String[] args) {
        SpringApplication.run(CartServiceApplication.class, args);
    }
}
