package com.f2c.custmaint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.custmaint.component.CustomerComponent;
import com.f2c.custmaint.entity.User;

@RestController
@CrossOrigin
@RequestMapping("/custmaint")
public class CustomerController {
	CustomerComponent customerComponent;
	
	@Autowired
	CustomerController(CustomerComponent customerComponent){
		this.customerComponent = customerComponent;
	}

	@RequestMapping(value="/create" , method = RequestMethod.POST)
	public String createUser(@RequestBody User user){
		return customerComponent.create(user);
	}	
	
	@RequestMapping("/get/{id}")
	public User getCustomer(@PathVariable String phone_number){
		return customerComponent.getCustomer(phone_number);
	}	
}
