package com.sample.orderservice.glblexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sample.orderservice.cstmexceptions.OrderExistsException;
import com.sample.orderservice.dto.ErrorResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value = OrderExistsException.class)
	public ResponseEntity<ErrorResponseDTO> returnOrderExistEntity(OrderExistsException oe){
		
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ErrorResponseDTO(HttpStatus.EXPECTATION_FAILED.toString(), oe.getMessage()));
	}
	
	
}
