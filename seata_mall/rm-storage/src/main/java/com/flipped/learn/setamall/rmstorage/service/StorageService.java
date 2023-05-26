package com.flipped.learn.setamall.rmstorage.service;


import com.flipped.learn.setamall.rmstorage.domain.Storage;
import com.flipped.learn.setamall.rmstorage.repository.StorageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StorageService {
    @Resource
    private StorageRepository storageRepository;

    @Transactional
    public Storage reduceStorage(Integer goodsId, Integer quantity) {
        Storage storage = storageRepository.findById(goodsId).get();
        if (storage.getQuantity() < quantity) {
            throw new IllegalStateException(goodsId + "商品库存不足");
        }
        storage.setQuantity(storage.getQuantity() - quantity);
        return storageRepository.save(storage);
    }
}
