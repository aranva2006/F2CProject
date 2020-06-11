package com.f2c.prodmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the society_details database table.
 * 
 */
@Entity
@Table(name="society_details")
@NamedQuery(name="SocietyDetail.findAll", query="SELECT s FROM SocietyDetail s")
public class SocietyDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SCOCEITY_ID")
	private int scoceityId;

	@Column(name="SOCIETY_ADDRESS_LINE1")
	private String societyAddressLine1;

	@Column(name="SOCIETY_ADDRESS_LINE2")
	private String societyAddressLine2;

	@Column(name="SOCIETY_CITY")
	private String societyCity;

	@Column(name="SOCIETY_CONTACT")
	private String societyContact;

	@Column(name="SOCIETY_COUNTRY")
	private String societyCountry;

	@Column(name="SOCIETY_NAME")
	private String societyName;

	@Column(name="SOCIETY_PINCODE")
	private String societyPincode;

	@Column(name="SOCIETY_STATE")
	private String societyState;

	public SocietyDetail() {
	}

	public int getScoceityId() {
		return this.scoceityId;
	}

	public void setScoceityId(int scoceityId) {
		this.scoceityId = scoceityId;
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