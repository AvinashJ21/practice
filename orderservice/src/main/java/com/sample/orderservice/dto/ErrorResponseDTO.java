package com.sample.orderservice.dto;

public class ErrorResponseDTO {
	
	private String status;
	private String msg;
	
	
	public ErrorResponseDTO(String status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
