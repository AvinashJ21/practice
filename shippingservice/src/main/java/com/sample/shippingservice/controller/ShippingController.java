package com.sample.shippingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.shippingservice.dto.ShippingResponseDto;
import com.sample.shippingservice.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

	@Autowired
	ShippingService shippingService;
	
	@PostMapping("/create")
	public ResponseEntity<ShippingResponseDto> createShippingOrder(){
		
		return ResponseEntity.status(HttpStatus.OK).body(new ShippingResponseDto(HttpStatus.CREATED,shippingService.createShippingOrder()));
		
	}

	
}
