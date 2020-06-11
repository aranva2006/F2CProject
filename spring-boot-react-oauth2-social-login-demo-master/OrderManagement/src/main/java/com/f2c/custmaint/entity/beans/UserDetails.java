package com.f2c.custmaint.entity.beans;

import java.io.Serializable;
import java.util.List;

public class UserDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private ContactInformation contactInformation;
	private SocietyDetail societyDetail;
	private UserType userType;
	private List<CustomerOrderDetails> customerOrderDetails;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public SocietyDetail getSocietyDetail() {
		return societyDetail;
	}

	public void setSocietyDetail(SocietyDetail societyDetail) {
		this.societyDetail = societyDetail;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<CustomerOrderDetails> getCustomerOrderDetails() {
		return customerOrderDetails;
	}

	public void setCustomerOrderDetails(List<CustomerOrderDetails> customerOrderDetails) {
		this.customerOrderDetails = customerOrderDetails;
	}

}
