package com.flipped.learn.orderservice.feignclient;

import com.flipped.learn.orderservice.dto.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// @FeignClient 注解说明当前接口为 OpenFeign 通信客户端，参数值 warehouse-service 为服务提供者 ID
@FeignClient("warehouse-service")
public interface WarehouseServiceFeignClient {
    
    // 声明的方法结构，接口中定义的方法通常与服务提供者的方法定义保持一致。
    // 这里有个非常重要的细节：用于接收数据的 Stock 对象并不强制要求与提供者端 Stock 对象完全相同
    // 消费者端的 Stock 类可以根据业务需要删减属性，但属性必须要与提供者响应的 JSON 属性保持一致
    @GetMapping("/stock")
    public Stock getStock(@RequestParam("skuId") Long skuId);
}