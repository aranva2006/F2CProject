package com.f2c.cartmaintenance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the cart_details database table.
 * 
 */
@Entity
@Table(name = "cart_details")
@NamedQuery(name = "CartDetail.findAll", query = "SELECT c FROM CartDetail c")
public class CartDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CART_DETAIL_ID")
	private int cartDetailId;

	private int quantity;

	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "USER_NAME")
	private String userName;

	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID", updatable = false, insertable = false)
	private Product product;

	public CartDetail() {
	}

	public int getCartDetailId() {
		return this.cartDetailId;
	}

	public void setCartDetailId(int cartDetailId) {
		this.cartDetailId = cartDetailId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}