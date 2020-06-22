package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


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
	@Column(name="ORDER_ID")
	private int orderId;

	@Column(name="ORDER_AMOUNT")
	private float orderAmount;

	@Column(name="ORDER_DATE")
	private Timestamp orderDate;

	@Column(name="ORDER_STATE")
	private String orderState;

	@Column(name="PAYMENT_DETAIL_ID")
	private int paymentDetailId;

	@Column(name="SCOCIETY_ID")
	private int scocietyId;

	@OneToMany(mappedBy="customerOrder")
	private List<CustomerOrderInfo> customerOrderInfos;

	@ManyToOne
	@JoinColumn(name="PHONE_NUMBER")
	private User user;

	public CustomerOrder() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public int getScocietyId() {
		return this.scocietyId;
	}

	public void setScocietyId(int scocietyId) {
		this.scocietyId = scocietyId;
	}

	public List<CustomerOrderInfo> getCustomerOrderInfos() {
		return this.customerOrderInfos;
	}

	public void setCustomerOrderInfos(List<CustomerOrderInfo> customerOrderInfos) {
		this.customerOrderInfos = customerOrderInfos;
	}

	public CustomerOrderInfo addCustomerOrderInfo(CustomerOrderInfo customerOrderInfo) {
		getCustomerOrderInfos().add(customerOrderInfo);
		customerOrderInfo.setCustomerOrder(this);
		return customerOrderInfo;
	}

	public CustomerOrderInfo removeCustomerOrderInfo(CustomerOrderInfo customerOrderInfo) {
		getCustomerOrderInfos().remove(customerOrderInfo);
		customerOrderInfo.setCustomerOrder(null);
		return customerOrderInfo;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}