package com.f2c.prodmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the product_source_details database table.
 * 
 */
@Entity
@Table(name="product_source_details")
@NamedQuery(name="ProductSourceDetail.findAll", query="SELECT p FROM ProductSourceDetail p")
public class ProductSourceDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_SOURCE_ID")
	private int productSourceId;

	@Column(name="PRODUCT_SOURCE_CITY")
	private String productSourceCity;

	@Column(name="PRODUCT_SOURCE_CONTACT_NUMBER1")
	private String productSourceContactNumber1;

	@Column(name="PRODUCT_SOURCE_CONTACT_NUMBER2")
	private String productSourceContactNumber2;

	@Column(name="PRODUCT_SOURCE_COUNTRY")
	private String productSourceCountry;

	@Column(name="PRODUCT_SOURCE_DISTRICT")
	private String productSourceDistrict;

	@Column(name="PRODUCT_SOURCE_FIRST_NAME")
	private String productSourceFirstName;

	@Column(name="PRODUCT_SOURCE_LAST_NAME")
	private String productSourceLastName;

	@Column(name="PRODUCT_SOURCE_STATE")
	private String productSourceState;

	//bi-directional many-to-one association to UserType
	@ManyToOne
	@JoinColumn(name="USER_TYPE_ID")
	private UserType userType;

	//bi-directional many-to-one association to ProductStock
	@OneToMany(mappedBy="productSourceDetail")
	private List<ProductStock> productStocks;

	public ProductSourceDetail() {
	}

	public int getProductSourceId() {
		return this.productSourceId;
	}

	public void setProductSourceId(int productSourceId) {
		this.productSourceId = productSourceId;
	}

	public String getProductSourceCity() {
		return this.productSourceCity;
	}

	public void setProductSourceCity(String productSourceCity) {
		this.productSourceCity = productSourceCity;
	}

	public String getProductSourceContactNumber1() {
		return this.productSourceContactNumber1;
	}

	public void setProductSourceContactNumber1(String productSourceContactNumber1) {
		this.productSourceContactNumber1 = productSourceContactNumber1;
	}

	public String getProductSourceContactNumber2() {
		return this.productSourceContactNumber2;
	}

	public void setProductSourceContactNumber2(String productSourceContactNumber2) {
		this.productSourceContactNumber2 = productSourceContactNumber2;
	}

	public String getProductSourceCountry() {
		return this.productSourceCountry;
	}

	public void setProductSourceCountry(String productSourceCountry) {
		this.productSourceCountry = productSourceCountry;
	}

	public String getProductSourceDistrict() {
		return this.productSourceDistrict;
	}

	public void setProductSourceDistrict(String productSourceDistrict) {
		this.productSourceDistrict = productSourceDistrict;
	}

	public String getProductSourceFirstName() {
		return this.productSourceFirstName;
	}

	public void setProductSourceFirstName(String productSourceFirstName) {
		this.productSourceFirstName = productSourceFirstName;
	}

	public String getProductSourceLastName() {
		return this.productSourceLastName;
	}

	public void setProductSourceLastName(String productSourceLastName) {
		this.productSourceLastName = productSourceLastName;
	}

	public String getProductSourceState() {
		return this.productSourceState;
	}

	public void setProductSourceState(String productSourceState) {
		this.productSourceState = productSourceState;
	}

	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<ProductStock> getProductStocks() {
		return this.productStocks;
	}

	public void setProductStocks(List<ProductStock> productStocks) {
		this.productStocks = productStocks;
	}

	public ProductStock addProductStock(ProductStock productStock) {
		getProductStocks().add(productStock);
		productStock.setProductSourceDetail(this);

		return productStock;
	}

	public ProductStock removeProductStock(ProductStock productStock) {
		getProductStocks().remove(productStock);
		productStock.setProductSourceDetail(null);

		return productStock;
	}

}