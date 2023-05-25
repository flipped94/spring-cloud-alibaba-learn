package com.flipped.learn.bservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("c-service")
public interface CServiceFeignClient {
    @GetMapping("/c")
    public String methodC();
}