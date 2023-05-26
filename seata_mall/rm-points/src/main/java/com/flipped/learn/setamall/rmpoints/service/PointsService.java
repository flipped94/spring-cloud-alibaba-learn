package com.flipped.learn.setamall.rmpoints.service;


import com.flipped.learn.setamall.rmpoints.domain.Points;
import com.flipped.learn.setamall.rmpoints.repository.PointsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PointsService {
    @Resource
    private PointsRepository orderRepository;

    @Transactional
    public Points addPoints(Integer memberId, Integer points) {
        Points entity = orderRepository.findById(memberId).get();
        entity.setPoints(entity.getPoints() + points);
        return orderRepository.save(new Points(memberId, entity.getPoints()));
    }
}
