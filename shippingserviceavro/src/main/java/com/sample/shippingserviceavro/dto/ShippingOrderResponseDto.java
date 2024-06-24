package com.sample.shippingserviceavro.dto;

public class ShippingOrderResponseDto {

	public String msg;
	public String status;

	public ShippingOrderResponseDto(String msg, String status) {
		super();
		this.msg = msg;
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
