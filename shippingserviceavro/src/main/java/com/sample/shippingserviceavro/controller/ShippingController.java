package com.sample.shippingserviceavro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.shippingserviceavro.dto.ShippingOrderResponseDto;
import com.sample.shippingserviceavro.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

	@Autowired
	ShippingService shippingService;
	
	@PostMapping("/createOrder")  
	public ResponseEntity<ShippingOrderResponseDto> createOrder(){
		
			return ResponseEntity.status(HttpStatus.OK).body(new ShippingOrderResponseDto(shippingService.createShippingOrder(), HttpStatus.CREATED.toString()));
		
	}
	
}
 