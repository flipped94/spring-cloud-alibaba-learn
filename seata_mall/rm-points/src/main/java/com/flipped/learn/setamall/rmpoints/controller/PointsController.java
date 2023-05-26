package com.flipped.learn.setamall.rmpoints.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipped.learn.setamall.rmpoints.domain.Points;
import com.flipped.learn.setamall.rmpoints.service.PointsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PointsController {
    @Resource
    private PointsService pointsService;

    @GetMapping("/add_points")
    public String addPoints(Integer memberId, Integer points) throws JsonProcessingException {
        Map result = new HashMap<>();
        Points entity = pointsService.addPoints(memberId, points);
        result.put("code", "0");
        result.put("message", "add points success");
        return new ObjectMapper().writeValueAsString(result);
    }
}
