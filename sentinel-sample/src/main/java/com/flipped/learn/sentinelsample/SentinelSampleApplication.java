package com.flipped.learn.sentinelsample;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SentinelSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelSampleApplication.class, args);
    }
}
