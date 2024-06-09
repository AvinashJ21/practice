package com.sample.orderservice.dto;

public class OrderResponseDTO {

	private String status;
	private String msg;

	public OrderResponseDTO(String msg, Long orderId) {
		this.msg = msg;
		this.status = "Congratulations your order has been created and your Order No. is "+orderId;
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
