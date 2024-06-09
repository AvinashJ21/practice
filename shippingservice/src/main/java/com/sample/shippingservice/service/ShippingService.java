package com.sample.shippingservice.service;

import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.shippingservice.dto.OrderDetailsJaxbDto;
import com.sample.shippingservice.entities.ShippingEntity;
import com.sample.shippingservice.repo.ShippingRepository;
import com.sample.shippingservice.util.JaxbXMLToObject;

@Service
public class ShippingService {

	@Autowired
	ShippingRepository shippingRepo;
	
	 public Long createShippingOrder() {
		 
		 	OrderDetailsJaxbDto orderDto = JaxbXMLToObject.xmltoObject();
		 	ShippingEntity se = new ShippingEntity();
		 	if(null!=orderDto) {		 		 
		 		 BeanUtils.copyProperties(orderDto, se);
		 		 se.setShippingTransactionId(UUID.randomUUID().toString());
		 	   	 se = shippingRepo.save(se);
		 	}
		 	return se.getShippingId();
		 	
	 }
	
	
}
