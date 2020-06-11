package com.f2c.custmaint.entity;

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
	@Column(name="scoceity_id")
	private int scoceityId;

	@Column(name="society_address_line1")
	private String societyAddressLine1;

	@Column(name="society_address_line2")
	private String societyAddressLine2;

	@Column(name="society_city")
	private String societyCity;

	@Column(name="society_contact")
	private String societyContact;

	@Column(name="society_country")
	private String societyCountry;

	@Column(name="society_name")
	private String societyName;

	@Column(name="society_pincode")
	private String societyPincode;

	@Column(name="society_state")
	private String societyState;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="societyDetail")
	private List<User> users;

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

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}