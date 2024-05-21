package com.bank.customerservice.mapper;

import com.bank.customerservice.dto.CustomerDTO;
import com.bank.customerservice.entities.Customer;

public class CustomerMapper {

	 public static Customer mapToEntity(CustomerDTO dto, Customer cstmr) {
		 
		 	  cstmr.setName(dto.getName());
		 	  cstmr.setPassword(dto.getPassword());
		 	  cstmr.setCustomerId(dto.getCustomerId());
		 	  cstmr.setMobileNo(dto.getMobileNo());
		 	  cstmr.setUserName(dto.getUserName());
		 	  return cstmr;
		 	  
	 }
	
}
