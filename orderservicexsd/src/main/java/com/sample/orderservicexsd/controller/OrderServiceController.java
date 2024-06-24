package com.sample.orderservicexsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.orderservicexsd.dto.OrderRequestDto;
import com.sample.orderservicexsd.dto.OrderResponseDto;
import com.sample.orderservicexsd.service.OrderService;



@RestController
@RequestMapping("/orders")
public class OrderServiceController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/create")
	public ResponseEntity<OrderResponseDto> createOrder(@RequestBody OrderRequestDto orderReq){
		
			return ResponseEntity.status(HttpStatus.OK).body(new OrderResponseDto(HttpStatus.CREATED.toString(),orderService.createOrder(orderReq)));
	
	}
	@GetMapping("/{id}")
	public ResponseEntity<OrderRequestDto> getOrder(@PathVariable Long id){
	
			return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrderDetails(id));
		
	}
	
	
	
	
}
