package com.f2c.prodmaint.entity.beans;

public class ProductSourceDetails {
	private int productSourceId;
	private String productSourceFirstName;
	private String productSourceLastName;
	private String productSourceContactNumber1;
	private String productSourceContactNumber2;
	private String productSourceCity;
	private String productSourceDistrict;
	private String productSourceState;
	private String productSourceCountry;

	private ProductSourceTypeDetails productSourceTypeDetails;

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

	public ProductSourceTypeDetails getProductSourceTypeDetails() {
		return productSourceTypeDetails;
	}

	public void setProductSourceTypeDetails(ProductSourceTypeDetails productSourceTypeDetails) {
		this.productSourceTypeDetails = productSourceTypeDetails;
	}

}
