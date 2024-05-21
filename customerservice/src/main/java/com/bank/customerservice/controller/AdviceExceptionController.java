package com.bank.customerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bank.customerservice.dto.ErrorResponseDTO;

@ControllerAdvice
public class AdviceExceptionController {

	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseDTO> badCredentials(BadCredentialsException excption){
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorResponseDTO(HttpStatus.FORBIDDEN.toString(), excption.getMessage()));
	}
	
}
