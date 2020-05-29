package com.f2c.prodmaint.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the product_category database table.
 * 
 */
@Entity
@Table(name="product_category")
@NamedQuery(name="ProductCategory.findAll", query="SELECT p FROM ProductCategory p")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_category_id")
	private int productCategoryId;

	@Column(name="product_category_code")
	private String productCategoryCode;

	@Column(name="product_category_desc")
	private String productCategoryDesc;

	//bi-directional many-to-one association to Product
	@OneToOne(mappedBy="productCategory")
	private Product product;

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

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}