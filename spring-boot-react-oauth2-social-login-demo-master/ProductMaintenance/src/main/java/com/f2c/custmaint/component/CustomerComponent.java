package com.f2c.custmaint.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.custmaint.entity.User;
import com.f2c.custmaint.repository.CustomerRepository;

@Service
public class CustomerComponent {
	private static final Logger logger = LoggerFactory.getLogger(CustomerComponent.class);

	CustomerRepository customerRepository;

	@Autowired
	public CustomerComponent(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public User getCustomer(String phone_number) {
		return customerRepository.getOne(phone_number);
	}

	public String create(User user) {
		customerRepository.save(user);
		return user.getPhoneNumber();
	}

}





