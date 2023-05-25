package com.flipped.learn.sentinelsample.service;

import org.springframework.stereotype.Service;

/**
 * 演示用的业务逻辑类
 */
@Service
public class SampleService {
    //模拟创建订单业务
    public void createOrder() {
        try {
            //模拟处理业务逻辑需要101毫秒
            Thread.sleep(101);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已创建");
    }
}