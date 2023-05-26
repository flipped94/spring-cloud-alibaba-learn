package com.flipped.learn.setamall.rmorder.repository;

import com.flipped.learn.setamall.rmorder.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
