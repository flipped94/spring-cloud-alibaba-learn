package com.flipped.learn.setamall.tmmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TMMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(TMMallApplication.class, args);
    }
}
