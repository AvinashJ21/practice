package com.sample.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.orderservice.entities.OrderEntity;

@Repository
public interface OrderReposiory extends JpaRepository<OrderEntity, Long> {

}
