package com.f2c.CartDetailsManagement.service.inf;

import org.springframework.http.ResponseEntity;

import com.f2c.CartDetailsManagement.entity.CartEntity;
import com.f2c.CartDetailsManagement.util.ResponseBean;

public interface CartServiceinf {

	//ResponseEntity<com.cart.details.util.ResponseBean> save(CartEntity cartentity);
	
	ResponseEntity<ResponseBean> save(CartEntity cartentity);

}
