package com.flipped.learn.setamall.rmpoints.repository;


import com.flipped.learn.setamall.rmpoints.domain.Points;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointsRepository extends JpaRepository<Points, Integer> {

}
