package com.sample.orderservice.cstmexceptions;

public class OrderExistsException extends RuntimeException {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -1328821207192377946L;

	public OrderExistsException(String msg) {
		 super(msg);
	 }

}
