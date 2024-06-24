package com.sample.orderservicexsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.orderservicexsd.entity.OrderEntity;

@Repository
public interface OrderReposiory extends JpaRepository<OrderEntity, Long> {

	 	
}
