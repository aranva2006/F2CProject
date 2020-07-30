package com.f2c.social.form;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UserProfile;

public class ProfileForm {
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String state;
	private String country;
	private String zipCode;
	private String headerErrors;
	
	public ProfileForm(Connection<?> connection) {
		UserProfile socialUserProfile = connection.fetchUserProfile();
		this.firstName = socialUserProfile.getFirstName();
		this.lastName = socialUserProfile.getLastName();
		this.email = socialUserProfile.getUsername();
	}
	
	public String getPhone() {
		return phone;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getHeaderErrors() {
		return headerErrors;
	}

	public void setHeaderErrors(String headerErrors) {
		this.headerErrors = headerErrors;
	}

}