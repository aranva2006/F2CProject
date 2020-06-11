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
	@Column(name="PRODUCT_STOCK_ID")
	private int productStockId;

	@Column(name="ORDERED_QUANTITY")
	private int orderedQuantity;
	
	@Column(name="price")
	private int price;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	//bi-directional many-to-one association to StockStatus
	@ManyToOne
	@JoinColumn(name="STOCK_STATUS_ID")
	private StockStatus stockStatus;

	//bi-directional many-to-one association to ProductSourceDetail
	@ManyToOne
	@JoinColumn(name="PRODUCT_SOURCE_ID")
	private ProductSourceDetail productSourceDetail;

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

	public StockStatus getStockStatus() {
		return this.stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}

	public ProductSourceDetail getProductSourceDetail() {
		return this.productSourceDetail;
	}

	public void setProductSourceDetail(ProductSourceDetail productSourceDetail) {
		this.productSourceDetail = productSourceDetail;
	}

}