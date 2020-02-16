package com.biter.lekima.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangdong
 * @date 2019-08-10
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan({"com.biter.lekima.admin.dba.repository"})
public class AdminApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
//        new SpringApplicationBuilder(AdminApplication.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication.run(AdminApplication.class, args);
    }

//    @KafkaListener(topics = "test")
//    public void listen(ConsumerRecord<String, String> cr) {
//        System.out.println("我是消费者:"+cr.toString());
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(AdminApplication.class);
//    }

}
