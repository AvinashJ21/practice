package com.sample.shippingservice.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "shiporder")
public class OrderDetailsJaxbDto {
	private Long oderId;

	private String productName;

	private Long productId;

	private Double productPrice;

	private Long userId;

	private String shipStatus;

	private String orderStatus;
	
	private String orderTransactionId;
	
	private String xmlFileName;

	@XmlElement
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

	@XmlElement
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@XmlElement
	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@XmlElement
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@XmlElement
	public String getShipStatus() {
		return shipStatus;
	}

	public void setShipStatus(String shipStatus) {
		this.shipStatus = shipStatus;
	}

	@XmlElement
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@XmlElement
	public String getOrderTransactionId() {
		return orderTransactionId;
	}

	public void setOrderTransactionId(String orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}

	public String getXmlFileName() {
		return xmlFileName;
	}

	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}
	
	
	
	
	
}

