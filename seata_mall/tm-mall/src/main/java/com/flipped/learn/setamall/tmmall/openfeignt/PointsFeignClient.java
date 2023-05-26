package com.flipped.learn.setamall.tmmall.openfeignt;//积分服务客户端

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("rm-points")
public interface PointsFeignClient {

    @GetMapping("/add_points")
    String addPoints(@RequestParam("memberId") Integer memberId, @RequestParam("points") Integer points);

}
