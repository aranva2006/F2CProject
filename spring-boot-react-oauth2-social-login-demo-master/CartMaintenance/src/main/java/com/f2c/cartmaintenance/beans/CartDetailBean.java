package com.f2c.cartmaintenance.beans;

import java.io.Serializable;

public class CartDetailBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userName;
	private int productId;
	private int quantity;

	public CartDetailBean() {
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUserName() {
		return userName;
	}

	public int getProductId() {
		return productId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
}