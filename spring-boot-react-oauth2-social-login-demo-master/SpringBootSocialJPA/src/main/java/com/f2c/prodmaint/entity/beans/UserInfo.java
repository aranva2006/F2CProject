package com.f2c.prodmaint.entity.beans;

import java.io.Serializable;
import java.util.Date;

public class UserInfo  implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String firstName;
	private String lastName;
	private String imageUrl;
	private String authToken;
	private Date expirty;
	private String displayName;
	private String isAuthenticated;
	private String emailId;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public Date getExpirty() {
		return expirty;
	}

	public void setExpirty(Date expirty) {
		this.expirty = expirty;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getIsAuthenticated() {
		return isAuthenticated;
	}

	public void setIsAuthenticated(String isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
