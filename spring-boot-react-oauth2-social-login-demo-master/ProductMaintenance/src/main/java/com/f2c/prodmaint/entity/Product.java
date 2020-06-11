package com.f2c.prodmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


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

	//bi-directional many-to-one association to ProductCategory
	@ManyToOne
	@JoinColumn(name="PRODUCT_CATEGORY_ID")
	private ProductCategory productCategory;

	//bi-directional many-to-one association to ProductStock
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

	public ProductCategory getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public List<ProductStock> getProductStocks() {
		return this.productStocks;
	}

	public void setProductStocks(List<ProductStock> productStocks) {
		this.productStocks = productStocks;
	}

	public ProductStock addProductStock(ProductStock productStock) {
		getProductStocks().add(productStock);
		productStock.setProduct(this);

		return productStock;
	}

	public ProductStock removeProductStock(ProductStock productStock) {
		getProductStocks().remove(productStock);
		productStock.setProduct(null);

		return productStock;
	}

}