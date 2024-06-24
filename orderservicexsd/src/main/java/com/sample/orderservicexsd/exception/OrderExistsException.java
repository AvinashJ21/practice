package com.sample.orderservicexsd.exception;

public class OrderExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6900781975729732578L;

	public OrderExistsException(String msg) {
		super(msg);
	}
	
}
