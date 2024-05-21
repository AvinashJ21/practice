package com.bank.customerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bank.customerservice.dto.CustomerDTO;
import com.bank.customerservice.entities.Customer;
import com.bank.customerservice.mapper.CustomerMapper;
import com.bank.customerservice.repository.CustomerRepository;

@Service
public class CustmrService {

	
	@Autowired
	CustomerRepository customerRepo;
	@Autowired
	PasswordEncoder pwdEncoder;
	public Long createCustomer(CustomerDTO dto) {
		
			Customer entity = new Customer();
			entity = CustomerMapper.mapToEntity(dto,entity);
			entity.setPassword(pwdEncoder.encode(dto.getPassword()));
			customerRepo.save(entity);
			return entity.getCustomerId();
	}
	
}
