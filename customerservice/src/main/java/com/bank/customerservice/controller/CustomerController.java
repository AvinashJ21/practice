package com.bank.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customerservice.dto.CustomerDTO;
import com.bank.customerservice.dto.CustomerResponseDTO;
import com.bank.customerservice.service.CustmrService;



@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustmrService cstmrService;

	@PostMapping("/create")
	public ResponseEntity<CustomerResponseDTO> createCustomer(@Validated @RequestBody CustomerDTO cstmrDto) {
		if (cstmrService.createCustomer(cstmrDto) != -1) {
			return ResponseEntity.status(HttpStatus.OK).body(
					new CustomerResponseDTO(HttpStatus.CREATED.toString(), HttpStatus.CREATED, "Customer is created"));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CustomerResponseDTO(
				HttpStatus.BAD_REQUEST.toString(), HttpStatus.BAD_REQUEST, "Failed to created customer"));
	}
	
	

}
