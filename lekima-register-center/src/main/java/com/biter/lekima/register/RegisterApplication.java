package com.biter.lekima.register;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangdong
 * @date 2019-08-10
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterApplication.class).web(WebApplicationType.SERVLET).run(args);
//        SpringApplication.run(RegisterApplication.class, args);
    }
}
