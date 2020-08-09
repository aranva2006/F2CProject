package com.f2c.cartmaintenance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product_stock database table.
 * 
 */
@Entity
@Table(name="product_stock")
@NamedQuery(name="ProductStock.findAll", query="SELECT p FROM ProductStock p")
public class ProductStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_STOCK_ID")
	private int productStockId;

	@Column(name="ORDERED_QUANTITY")
	private int orderedQuantity;
	
	@Column(name="price")
	private int price;

	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	public ProductStock() {
	}

	public int getProductStockId() {
		return this.productStockId;
	}

	public void setProductStockId(int productStockId) {
		this.productStockId = productStockId;
	}

	public int getOrderedQuantity() {
		return this.orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}