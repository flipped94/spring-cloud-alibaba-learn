package com.flipped.learn.sentinelsample.controller;

import com.flipped.learn.sentinelsample.dto.ResponseObject;
import com.flipped.learn.sentinelsample.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 演示用的业务逻辑类
 */
@RestController

public class SentinelSampleController {

    @Resource
    private SampleService sampleService;

    /**
     * 流控测试接口
     *
     * @return
     */
    @GetMapping("/test_flow_rule")
    public ResponseObject testFlowRule() {
        //code=0 代表服务器处理成功
        return new ResponseObject("0", "success!");

    }

    /**
     * 熔断测试接口
     *
     * @return
     */

    @GetMapping("/test_degrade_rule")
    public ResponseObject testDegradeRule() {
        try {
            sampleService.createOrder();
        } catch (IllegalStateException e) {
            //当 createOrder 业务处理过程中产生错误时会抛出IllegalStateException
            //IllegalStateException 是 JAVA 内置状态异常，在项目开发时可以更换为自己项目的自定义异常
            //出现错误后将异常封装为响应对象后JSON输出
            return new ResponseObject(e.getClass().getSimpleName(), e.getMessage());

        }
        return new ResponseObject("0", "order created!");

    }

}
