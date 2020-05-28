package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the customer_orders database table.
 * 
 */
@Entity
@Table(name="customer_orders")
@NamedQuery(name="CustomerOrder.findAll", query="SELECT c FROM CustomerOrder c")
public class CustomerOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_id")
	private int orderId;

	@Column(name="delivery_date")
	private Timestamp deliveryDate;

	@Column(name="delivery_status")
	private String deliveryStatus;

	@Column(name="order_amount")
	private float orderAmount;

	@Column(name="order_date")
	private Timestamp orderDate;

	@Column(name="order_state")
	private String orderState;

	@Column(name="payment_detail_id")
	private int paymentDetailId;

	@Column(name="phone_number")
	private int phoneNumber;

	@Column(name="product_id")
	private int productId;

	private int quantity;

	@Column(name="scociety_id")
	private int scocietyId;

	public CustomerOrder() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public float getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public int getPaymentDetailId() {
		return this.paymentDetailId;
	}

	public void setPaymentDetailId(int paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getScocietyId() {
		return this.scocietyId;
	}

	public void setScocietyId(int scocietyId) {
		this.scocietyId = scocietyId;
	}

}