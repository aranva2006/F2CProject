package com.f2c.order.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the payment_details database table.
 * 
 */
@Entity
@Table(name="payment_details")
@NamedQuery(name="PaymentDetail.findAll", query="SELECT p FROM PaymentDetail p")
public class PaymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="payment_detail_id")
	private int paymentDetailId;

	@Column(name="payment_status")
	private String paymentStatus;

	public PaymentDetail() {
	}

	public int getPaymentDetailId() {
		return this.paymentDetailId;
	}

	public void setPaymentDetailId(int paymentDetailId) {
		this.paymentDetailId = paymentDetailId;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}