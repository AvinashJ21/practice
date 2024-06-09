package com.sample.shippingservice.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ShippingOrders")
public class ShippingEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3390149829156151137L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shippingId;
   
    @Column
    private String shippingTransactionId;
    
    @Column
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
	
	@Column
	private String xmlFileName;

	public Long getShippingId() {
		return shippingId;
	}

	public void setShippingId(Long shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingTransactionId() {
		return shippingTransactionId;
	}

	public void setShippingTransactionId(String shippingTransactionId) {
		this.shippingTransactionId = shippingTransactionId;
	}

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

	public String getXmlFileName() {
		return xmlFileName;
	}

	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}

	
	

}
