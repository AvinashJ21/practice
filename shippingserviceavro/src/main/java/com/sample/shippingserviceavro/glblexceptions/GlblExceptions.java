package com.sample.shippingserviceavro.glblexceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sample.shippingserviceavro.exception.OrderProcessingException;

@ControllerAdvice
public class GlblExceptions {

	@ExceptionHandler(OrderProcessingException.class)
	public ResponseEntity<Map<String, Object>> orderProcessException(OrderProcessingException e) {

		Map<String, Object> resp = new HashMap<>();
		resp.put("msg", e.getMessage());
		resp.put("status", "Prcoessing failed");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resp);

	}

}
