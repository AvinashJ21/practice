package com.bank.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.customerservice.dto.CustomerDTO;
import com.bank.customerservice.dto.CustomerDetailsDTO;
import com.bank.customerservice.dto.CustomerResponseDTO;
import com.bank.customerservice.service.CustmrService;
import com.bank.customerservice.service.JWTService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustmrService cstmrService;

	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JWTService jwtService;

	@PostMapping("/create")
	public ResponseEntity<CustomerResponseDTO> createCustomer(@Valid @RequestBody CustomerDTO cstmrDto) {
		if (cstmrService.createCustomer(cstmrDto) != -1) {
			return ResponseEntity.status(HttpStatus.OK).body(new CustomerResponseDTO(HttpStatus.CREATED.toString(),
					HttpStatus.CREATED, "Customer is created", null));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CustomerResponseDTO(
				HttpStatus.BAD_REQUEST.toString(), HttpStatus.BAD_REQUEST, "Failed to created customer", null));
	}

	@PostMapping("/login")
	public ResponseEntity<CustomerResponseDTO> login(@RequestBody CustomerDetailsDTO cstmrDetails) {

		Authentication auth = authManager.authenticate(
				new UsernamePasswordAuthenticationToken(cstmrDetails.getUserName(), cstmrDetails.getPassword()));
		if (auth.isAuthenticated()) {
			return ResponseEntity.status(HttpStatus.OK)
					.body(new CustomerResponseDTO(HttpStatus.ACCEPTED.toString(), HttpStatus.ACCEPTED,
							"User authenticated", new CustomerDetailsDTO(auth.getName(), null, jwtService.getJWTKey(cstmrDetails.getUserName(), "USER"),
									(List<? extends GrantedAuthority>) auth.getAuthorities())));
		} else {
			throw new BadCredentialsException("Invalid User");
		}

	}
	
	@GetMapping("/{customerId}")
	public String getUser(@PathVariable String customerId) {
		
		return "SUCCESS";
		
	}

}
