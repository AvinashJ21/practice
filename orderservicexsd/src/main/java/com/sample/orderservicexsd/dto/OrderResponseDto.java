package com.sample.orderservicexsd.dto;

public class OrderResponseDto {

	public String status;
	public String msg;

	public OrderResponseDto(String status, Long order) {
		 
		this.status = status;
		this.msg= "Congratulations order created "+order;
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
