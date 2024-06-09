package com.sample.orderservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long oderId;

	@Column
	private String productName;

	@Column
	private Long productId;

	@Column
	private Double productPrice;

	@Column
	private Long userId;

	@Column
	private String shipStatus;

	@Column
	private String orderStatus;
	
	@Column
	private String orderTransactionId;

	public Long getOderId() {
		return oderId;
	}

	public void setOderId(Long oderId) {
		this.oderId = oderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getShipStatus() {
		return shipStatus;
	}

	public void setShipStatus(String shipStatus) {
		this.shipStatus = shipStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderTransactionId() {
		return orderTransactionId;
	}

	public void setOrderTransactionId(String orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}
	

}
