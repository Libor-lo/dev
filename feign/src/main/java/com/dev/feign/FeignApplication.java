package com.dev.feign;

import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONObject;
import com.dev.feign.config.mq.MessageSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

    @Bean
    public SpringUtil springUtil (){
        return new SpringUtil();
    }

    public static void main(String[] args) {

        SpringApplication.run(FeignApplication.class, args);

        MessageSender messageSender = SpringUtil.getBean(MessageSender.class);
        boolean hello = messageSender.send(MessageBuilder.withPayload("hello").build());
        System.out.println("=================================================");
        System.out.println(hello);
        System.out.println("=================================================");


    }

}
