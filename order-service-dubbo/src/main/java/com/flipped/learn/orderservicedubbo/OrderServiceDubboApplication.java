package com.flipped.learn.orderservicedubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class OrderServiceDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceDubboApplication.class, args);
    }
}
