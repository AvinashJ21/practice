package com.sample.shippingservice.dto;

import org.springframework.http.HttpStatus;

public class ShippingResponseDto {

	public String satus;
	public String msg;

	public ShippingResponseDto(HttpStatus created, Long shippingOrder) {
		satus = created.toString();
		msg = "Shipping Order Created " + shippingOrder;
	}

	public String getSatus() {
		return satus;
	}

	public void setSatus(String satus) {
		this.satus = satus;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
