package com.flipped.learn.warehouseservicedubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class WarehouseServiceDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseServiceDubboApplication.class, args);
    }
}
