package com.f2c.order.entity.beans;

import java.io.Serializable;
import java.sql.Timestamp;


public class CustomerOrderInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int orderInfoId;
	private Timestamp deliveryDate;
	private String deliveryStatus;
	private float productAmount;
	private int productId;
	private String status;
	
	public CustomerOrderInfo() {
	}

	public int getOrderInfoId() {
		return this.orderInfoId;
	}

	public void setOrderInfoId(int orderInfoId) {
		this.orderInfoId = orderInfoId;
	}

	public Timestamp getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public float getProductAmount() {
		return this.productAmount;
	}

	public void setProductAmount(float productAmount) {
		this.productAmount = productAmount;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}