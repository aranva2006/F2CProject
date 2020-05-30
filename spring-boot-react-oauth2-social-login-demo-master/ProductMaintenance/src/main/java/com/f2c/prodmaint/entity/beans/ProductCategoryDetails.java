package com.f2c.prodmaint.entity.beans;

import java.io.Serializable;

public class ProductCategoryDetails implements Serializable {
	public int product_category_id;
	public String product_category_code;
	public String product_category_desc;
	private static final long serialVersionUID = 1L;

	public ProductCategoryDetails() {
	}

	public int getProduct_category_id() {
		return product_category_id;
	}

	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
	}

	public String getProduct_category_code() {
		return product_category_code;
	}

	public void setProduct_category_code(String product_category_code) {
		this.product_category_code = product_category_code;
	}

	public String getProduct_category_desc() {
		return product_category_desc;
	}

	public void setProduct_category_desc(String product_category_desc) {
		this.product_category_desc = product_category_desc;
	}

}