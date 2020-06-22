package com.f2c.prodmaint.entity.beans;

import java.io.Serializable;

public class SocietyDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	private int scocietyId;
	private String societyAddressLine1;
	private String societyAddressLine2;
	private String societyCity;
	private String societyContact;
	private String societyCountry;
	private String societyName;
	private String societyPincode;
	private String societyState;

	public SocietyDetail() {
	}
	
	public int getScocietyId() {
		return scocietyId;
	}
	
	public void setScocietyId(int scocietyId) {
		this.scocietyId = scocietyId;
	}

	public String getSocietyAddressLine1() {
		return this.societyAddressLine1;
	}

	public void setSocietyAddressLine1(String societyAddressLine1) {
		this.societyAddressLine1 = societyAddressLine1;
	}

	public String getSocietyAddressLine2() {
		return this.societyAddressLine2;
	}

	public void setSocietyAddressLine2(String societyAddressLine2) {
		this.societyAddressLine2 = societyAddressLine2;
	}

	public String getSocietyCity() {
		return this.societyCity;
	}

	public void setSocietyCity(String societyCity) {
		this.societyCity = societyCity;
	}

	public String getSocietyContact() {
		return this.societyContact;
	}

	public void setSocietyContact(String societyContact) {
		this.societyContact = societyContact;
	}

	public String getSocietyCountry() {
		return this.societyCountry;
	}

	public void setSocietyCountry(String societyCountry) {
		this.societyCountry = societyCountry;
	}

	public String getSocietyName() {
		return this.societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocietyPincode() {
		return this.societyPincode;
	}

	public void setSocietyPincode(String societyPincode) {
		this.societyPincode = societyPincode;
	}

	public String getSocietyState() {
		return this.societyState;
	}

	public void setSocietyState(String societyState) {
		this.societyState = societyState;
	}
}