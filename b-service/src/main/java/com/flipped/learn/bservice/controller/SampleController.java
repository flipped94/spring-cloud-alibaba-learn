package com.flipped.learn.bservice.controller;

import com.flipped.learn.bservice.feignclient.CServiceFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SampleController {
    @Resource
    private CServiceFeignClient cService;

    @GetMapping("/b")
    public String methodB() {
        String result = cService.methodC();
        result = " -> Service B" + result;
        return result;
    }
}
