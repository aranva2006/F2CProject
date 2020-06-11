package com.f2c.prodmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_type database table.
 * 
 */
@Entity
@Table(name="user_type")
@NamedQuery(name="UserType.findAll", query="SELECT u FROM UserType u")
public class UserType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_TYPE_ID")
	private int userTypeId;

	@Column(name="USER_TYPE_CODE")
	private String userTypeCode;

	@Column(name="USER_TYPE_DESC")
	private String userTypeDesc;

	//bi-directional many-to-one association to ProductSourceDetail
	@OneToMany(mappedBy="userType")
	private List<ProductSourceDetail> productSourceDetails;

	public UserType() {
	}

	public int getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserTypeCode() {
		return this.userTypeCode;
	}

	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}

	public String getUserTypeDesc() {
		return this.userTypeDesc;
	}

	public void setUserTypeDesc(String userTypeDesc) {
		this.userTypeDesc = userTypeDesc;
	}

	public List<ProductSourceDetail> getProductSourceDetails() {
		return this.productSourceDetails;
	}

	public void setProductSourceDetails(List<ProductSourceDetail> productSourceDetails) {
		this.productSourceDetails = productSourceDetails;
	}

	public ProductSourceDetail addProductSourceDetail(ProductSourceDetail productSourceDetail) {
		getProductSourceDetails().add(productSourceDetail);
		productSourceDetail.setUserType(this);

		return productSourceDetail;
	}

	public ProductSourceDetail removeProductSourceDetail(ProductSourceDetail productSourceDetail) {
		getProductSourceDetails().remove(productSourceDetail);
		productSourceDetail.setUserType(null);

		return productSourceDetail;
	}

}