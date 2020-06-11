package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the contact_information database table.
 * 
 */
@Entity
@Table(name = "contact_information")
@NamedQuery(name = "ContactInformation.findAll", query = "SELECT c FROM ContactInformation c")
public class ContactInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "contact_id")
	private int contactId;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "alternate_phone")
	private String alternatePhone;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "pin_code")
	private String pinCode;

	@Column(name = "state")
	private String state;

	@OneToOne(mappedBy = "contactInformation", fetch = FetchType.LAZY)
	private User user;

	public ContactInformation() {
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAlternatePhone() {
		return this.alternatePhone;
	}

	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}