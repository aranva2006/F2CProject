package com.f2c.order.entity.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CustomerOrderDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private int orderId;
	private float orderAmount;
	private Timestamp orderDate;
	private String orderState;
	private int paymentDetailId;
	private int scocietyId;
	private List<CustomerOrderInfo> customerOrders = new ArrayList<CustomerOrderInfo>();

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public int getPaymentDetailId() {
		return paymentDetailId;
	}

	public void setPaymentDetailId(int paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}

	public int getScocietyId() {
		return scocietyId;
	}

	public void setScocietyId(int scocietyId) {
		this.scocietyId = scocietyId;
	}

	public List<CustomerOrderInfo> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(List<CustomerOrderInfo> customerOrders) {
		this.customerOrders = customerOrders;
	}

}