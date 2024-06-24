package com.sample.shippingserviceavro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.shippingserviceavro.entities.ShippingOrderEntity;

@Repository
public interface ShippingRepo extends JpaRepository<ShippingOrderEntity, Long> {

}
