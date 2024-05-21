package com.bank.customerservice.dto;

import org.springframework.http.HttpStatus;

public class CustomerResponseDTO {
	
	private String statusStr;
	private HttpStatus status;
	private String message;
	private Object obj;
	public CustomerResponseDTO(String status,HttpStatus httpStatus,String msg,Object obj) {
		
		this.statusStr= status;
		this.status = httpStatus;
		this.message = msg; 
		this.obj = obj;
	}
	
	
	
	public Object getObj() {
		return obj;
	}



	public void setObj(Object obj) {
		this.obj = obj;
	}



	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
