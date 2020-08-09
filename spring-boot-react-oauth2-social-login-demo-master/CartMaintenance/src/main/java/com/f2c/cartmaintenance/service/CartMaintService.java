package com.f2c.cartmaintenance.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.f2c.cartmaintenance.beans.CartDetailBean;
import com.f2c.cartmaintenance.util.ResponseBean;

public interface CartMaintService {

	// ResponseEntity<com.cart.details.util.ResponseBean> save(CartEntity
	// cartentity);

	ResponseEntity<ResponseBean> save(CartDetailBean cartDetailBean);

	List<CartDetailBean> getCartDetails(String userName);

}
