package com.f2c.CartDetailsManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_details")
public class CartEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CART_DETAIL_ID", updatable = false, nullable = false)
	int cartDetailId;

	@Column(name = "QUANTITY")
	int quantity;

	@Column(name = "USER_NAME")
	String userName;

	@OneToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name = "PRODUCT_ID")
	private int productId;

	public int getCartDetailId() {
		return cartDetailId;
	}

	public Product getProduct() {
		return product;
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

	public void setCartDetailId(int cartDetailId) {
		this.cartDetailId = cartDetailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartEntity [cartDetailId=" + cartDetailId + ", userName=" + userName + ", quantity=" + quantity + "]";
	}

}
