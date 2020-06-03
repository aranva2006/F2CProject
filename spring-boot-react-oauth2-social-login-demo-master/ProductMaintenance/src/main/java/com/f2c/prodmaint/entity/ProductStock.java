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
	@Column(name="product_stock_detail_id")
	private int productDetailId;

	@Column(name="ordered_quantity")
	private int orderedQuantity;

	@Column(name="price")
	private int price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private List<Product> product;
	
	@OneToOne
	@JoinColumn(name="stock_status_id")
	private StockStatus stockStatus;
	
	@OneToOne
	@JoinColumn(name="product_source_id")
	private ProductSource productSource;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Product product;
	
	public ProductStock() {
	}

	public int getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}

	public ProductSource getProductSource() {
		return productSource;
	}

	public void setProductSource(ProductSource productSource) {
		this.productSource = productSource;
	}

}