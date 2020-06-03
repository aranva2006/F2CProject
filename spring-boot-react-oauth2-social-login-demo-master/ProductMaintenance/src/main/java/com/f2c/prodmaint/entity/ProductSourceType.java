package com.f2c.prodmaint.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_SOURCE_TYPE")
public class ProductSourceType {
	@Id
	@Column(name = "PRODUCT_SOURCE_TYPE_ID")
	private int productSourceId;

	@Column(name = "PRODUCT_SOURCE_TYPE_CODE")
	private String productSourceTypeCode;

	@Column(name = "PRODUCT_SOURCE_TYPE_DESC")
	private String productSourceTypeDesc;

	@OneToMany(mappedBy = "productSourceType")
	private List<ProductSource> productSource;

	public int getProductSourceId() {
		return productSourceId;
	}

	public void setProductSourceId(int productSourceId) {
		this.productSourceId = productSourceId;
	}

	public String getProductSourceTypeCode() {
		return productSourceTypeCode;
	}

	public void setProductSourceTypeCode(String productSourceTypeCode) {
		this.productSourceTypeCode = productSourceTypeCode;
	}

	public String getProductSourceTypeDesc() {
		return productSourceTypeDesc;
	}

	public void setProductSourceTypeDesc(String productSourceTypeDesc) {
		this.productSourceTypeDesc = productSourceTypeDesc;
	}

	public List<ProductSource> getProductSource() {
		return productSource;
	}

	public void setProductSource(List<ProductSource> productSource) {
		this.productSource = productSource;
	}

}
