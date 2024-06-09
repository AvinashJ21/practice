package com.sample.shippingservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.shippingservice.entities.ShippingEntity;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {


}
