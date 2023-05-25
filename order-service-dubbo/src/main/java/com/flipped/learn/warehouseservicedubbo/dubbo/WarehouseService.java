package com.flipped.learn.warehouseservicedubbo.dubbo;


import com.flipped.learn.warehouseservicedubbo.dto.Stock;

//Provider接口
public interface WarehouseService {
    //查询库存
    Stock getStock(Long skuId);
}