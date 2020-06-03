package com.f2c.prodmaint.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.f2c.prodmaint.entity.beans.ProductSourceDetails;

@Entity
@Table(name = "user_type")
@NamedQuery(name = "UserType.findAll", query = "SELECT u FROM UserType u")
public class UserType  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_type_id")
	private int userTypeId;

	@Column(name = "user_type_code")
	private String userTypeCode;

	@Column(name = "user_type_desc")
	private String userTypeDesc;
	
	@OneToMany(mappedBy="userType")
	private List<ProductSource> productSource;

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserTypeCode() {
		return userTypeCode;
	}

	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}

	public String getUserTypeDesc() {
		return userTypeDesc;
	}

	public void setUserTypeDesc(String userTypeDesc) {
		this.userTypeDesc = userTypeDesc;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
