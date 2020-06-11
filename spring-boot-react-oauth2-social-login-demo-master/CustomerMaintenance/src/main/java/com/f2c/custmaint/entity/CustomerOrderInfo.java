package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "customer_order_info")
@NamedQuery(name = "CustomerOrderInfo.findAll", query = "SELECT c FROM CustomerOrderInfo c")
public class CustomerOrderInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ORDER_INFO_ID")
	private int orderInfoId;

	@Column(name = "DELIVERY_DATE")
	private Timestamp deliveryDate;

	@Column(name = "DELIVERY_STATUS")
	private String deliveryStatus;

	@Column(name = "PRODUCT_AMOUNT")
	private float productAmount;

	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "QUANTITY")
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private CustomerOrder customerOrder;

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

	public CustomerOrder getCustomerOrder() {
		return this.customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}