package com.sample.orderservicexsd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sample.orderservicexsd.dto.ErrorResponseEntity;

@ControllerAdvice
public class GlobalExceptions {

	
	@ExceptionHandler(value = OrderExistsException.class)
	public ResponseEntity<ErrorResponseEntity> handleOrderExists(OrderExistsException oe){
		
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ErrorResponseEntity(HttpStatus.EXPECTATION_FAILED.toString(), oe.getMessage()));
		
	}
	
//	@ExceptionHandler(value = Throwable.class)
//	public ResponseEntity<ErrorResponseEntity> handleAnyExceptions(Throwable oe){
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR.toString(), oe.getMessage()));
//		
//	}
//	
}
