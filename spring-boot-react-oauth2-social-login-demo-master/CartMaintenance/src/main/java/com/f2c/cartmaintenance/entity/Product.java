package com.f2c.cartmaintenance.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_ID")
	private int productId;

	@Column(name="LAST_ADDED")
	private Timestamp lastAdded;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="PRODUCT_DESC")
	private String productDesc;

	@Column(name="PRODUCT_STATUS")
	private String productStatus;

	@OneToMany(mappedBy="product")
	private List<CartDetail> cartDetails;
	
	@OneToMany(mappedBy="product")
	private List<ProductStock> productStocks;

	public Product() {
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Timestamp getLastAdded() {
		return this.lastAdded;
	}

	public void setLastAdded(Timestamp lastAdded) {
		this.lastAdded = lastAdded;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductStatus() {
		return this.productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public List<CartDetail> getCartDetails() {
		return this.cartDetails;
	}

	public void setCartDetails(List<CartDetail> cartDetails) {
		this.cartDetails = cartDetails;
	}

	public CartDetail addCartDetail(CartDetail cartDetail) {
		getCartDetails().add(cartDetail);
		cartDetail.setProduct(this);

		return cartDetail;
	}

	public CartDetail removeCartDetail(CartDetail cartDetail) {
		getCartDetails().remove(cartDetail);
		cartDetail.setProduct(null);

		return cartDetail;
	}

}