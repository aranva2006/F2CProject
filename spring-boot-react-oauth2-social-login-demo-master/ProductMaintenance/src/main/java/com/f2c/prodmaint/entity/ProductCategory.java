package com.f2c.prodmaint.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the product_category database table.
 * 
 */
@Entity
@Table(name = "product_category")
@NamedQuery(name = "ProductCategory.findAll", query = "SELECT p FROM ProductCategory p")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_category_id")
	private int productCategoryId;

	@Column(name = "product_category_code")
	private String productCategoryCode;

	@Column(name = "product_category_desc")
	private String productCategoryDesc;

	@OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
	private List<Product> products;

	public ProductCategory() {
	}

	public int getProductCategoryId() {
		return this.productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryCode() {
		return this.productCategoryCode;
	}

	public void setProductCategoryCode(String productCategoryCode) {
		this.productCategoryCode = productCategoryCode;
	}

	public String getProductCategoryDesc() {
		return this.productCategoryDesc;
	}

	public void setProductCategoryDesc(String productCategoryDesc) {
		this.productCategoryDesc = productCategoryDesc;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProduct(List<Product> products) {
		this.products = products;
	}

}