package com.f2c.prodmaint.entity;

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
	@Column(name="product_detail_id")
	private int productDetailId;

	private int quantity;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public ProductStock() {
	}

	public int getProductDetailId() {
		return this.productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
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

}