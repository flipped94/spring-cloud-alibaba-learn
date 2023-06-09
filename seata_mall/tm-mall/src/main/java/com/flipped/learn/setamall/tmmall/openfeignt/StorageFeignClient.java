package com.flipped.learn.setamall.tmmall.openfeignt;//库存服务客户端

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("rm-storage")
public interface StorageFeignClient {

    @GetMapping("/reduce_storage")
    String reduceStorage(@RequestParam("goodsId") Integer goodsId, @RequestParam("quantity") Integer quantity);

}
