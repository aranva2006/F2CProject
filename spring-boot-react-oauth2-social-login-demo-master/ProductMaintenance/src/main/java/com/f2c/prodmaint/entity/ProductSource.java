package com.f2c.prodmaint.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_SOURCE")
public class ProductSource {
	@Id
	@Column(name = "product_source_id")
	private int productSourceId;

	@Column(name = "product_source_first_name")
	private String productSourceFirstName;

	@Column(name = "product_source_last_name")
	private String productSourceLastName;

	@Column(name = "product_source_contact_number1")
	private String productSourceContactNumber1;

	@Column(name = "product_source_contact_number2")
	private String productSourceContactNumber2;

	@Column(name = "product_source_city")
	private String productSourceCity;

	@Column(name = "product_source_district")
	private String productSourceDistrict;

	@Column(name = "product_source_state")
	private String productSourceState;

	@Column(name = "product_source_country")
	private String productSourceCountry;

	@ManyToOne
	@JoinColumn(name = "product_source_type_id")
	private ProductSourceType productSourceType;

	public int getProductSourceId() {
		return productSourceId;
	}

	public void setProductSourceId(int productSourceId) {
		this.productSourceId = productSourceId;
	}

	public String getProductSourceFirstName() {
		return productSourceFirstName;
	}

	public void setProductSourceFirstName(String productSourceFirstName) {
		this.productSourceFirstName = productSourceFirstName;
	}

	public String getProductSourceLastName() {
		return productSourceLastName;
	}

	public void setProductSourceLastName(String productSourceLastName) {
		this.productSourceLastName = productSourceLastName;
	}

	public String getProductSourceContactNumber1() {
		return productSourceContactNumber1;
	}

	public void setProductSourceContactNumber1(String productSourceContactNumber1) {
		this.productSourceContactNumber1 = productSourceContactNumber1;
	}

	public String getProductSourceContactNumber2() {
		return productSourceContactNumber2;
	}

	public void setProductSourceContactNumber2(String productSourceContactNumber2) {
		this.productSourceContactNumber2 = productSourceContactNumber2;
	}

	public String getProductSourceCity() {
		return productSourceCity;
	}

	public void setProductSourceCity(String productSourceCity) {
		this.productSourceCity = productSourceCity;
	}

	public String getProductSourceDistrict() {
		return productSourceDistrict;
	}

	public void setProductSourceDistrict(String productSourceDistrict) {
		this.productSourceDistrict = productSourceDistrict;
	}

	public String getProductSourceState() {
		return productSourceState;
	}

	public void setProductSourceState(String productSourceState) {
		this.productSourceState = productSourceState;
	}

	public String getProductSourceCountry() {
		return productSourceCountry;
	}

	public void setProductSourceCountry(String productSourceCountry) {
		this.productSourceCountry = productSourceCountry;
	}

	public ProductSourceType getProductSourceType() {
		return productSourceType;
	}

	public void setProductSourceType(ProductSourceType productSourceType) {
		this.productSourceType = productSourceType;
	}

}
