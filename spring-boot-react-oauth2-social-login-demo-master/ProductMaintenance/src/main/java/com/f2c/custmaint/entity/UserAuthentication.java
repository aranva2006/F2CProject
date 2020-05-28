package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_authentication database table.
 * 
 */
@Entity
@Table(name="user_authentication")
@NamedQuery(name="UserAuthentication.findAll", query="SELECT u FROM UserAuthentication u")
public class UserAuthentication implements Serializable {
	private static final long serialVersionUID = 1L;

	private String password;

	@Column(name="user_id")
	private String userId;

	public UserAuthentication() {
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}