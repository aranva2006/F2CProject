package com.f2c.custmaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.custmaint.component.CustomerComponent;
import com.f2c.custmaint.component.SocietyComponent;
import com.f2c.custmaint.entity.beans.SocietyDetail;
import com.f2c.custmaint.entity.beans.UserDetails;

@RestController
@CrossOrigin
@RequestMapping("/custmaint")
public class CustomerController {
	CustomerComponent customerComponent;
	SocietyComponent societyComponent;

	@Autowired
	CustomerController(CustomerComponent customerComponent, SocietyComponent societyComponent) {
		this.customerComponent = customerComponent;
		this.societyComponent = societyComponent;
	}

	@RequestMapping(value = "/get/{phone_number}", method = RequestMethod.GET)
	public UserDetails getCustomer(@PathVariable String phone_number) {
		return customerComponent.getCustomer(phone_number);
	}

	@RequestMapping(value = "/getAllSocieties", method = RequestMethod.GET)
	public List<SocietyDetail> getAllSocietyDetails() {
		return societyComponent.getAllSocietyDetails();
	}
}
