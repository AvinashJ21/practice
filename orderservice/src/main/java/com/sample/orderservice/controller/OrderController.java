package com.sample.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.orderservice.dto.OrderRequestDTO;
import com.sample.orderservice.dto.OrderResponseDTO;
import com.sample.orderservice.service.OrderService;
//https://www.baeldung.com/java-convert-json-to-xml
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/neworder")
	public ResponseEntity<OrderResponseDTO> newOrder(@RequestBody OrderRequestDTO orderDto){
		
		   return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDTO(HttpStatus.CREATED.toString(),orderService.saveOrder(orderDto)));
		
		
	}
	
}
