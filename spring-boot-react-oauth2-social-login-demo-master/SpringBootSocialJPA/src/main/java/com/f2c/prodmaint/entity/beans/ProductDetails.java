package com.f2c.prodmaint.entity.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private int productId;
	private Timestamp lastAdded;
	private String productCode;
	private String productDesc;
	private ProductCategoryDetails productCategory;
	private List<ProductStockDetails> productStocks;
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Timestamp getLastAdded() {
		return lastAdded;
	}

	public void setLastAdded(Timestamp lastAdded) {
		this.lastAdded = lastAdded;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public ProductCategoryDetails getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategoryDetails productCategory) {
		this.productCategory = productCategory;
	}

	public List<ProductStockDetails> getProductStocks() {
		return productStocks;
	}

	public void setProductStocks(List<ProductStockDetails> productStocks) {
		this.productStocks = productStocks;
	}

}
