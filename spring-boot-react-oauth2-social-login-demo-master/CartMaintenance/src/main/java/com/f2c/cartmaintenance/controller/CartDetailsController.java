package com.f2c.cartmaintenance.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.cartmaintenance.beans.CartDetailBean;
import com.f2c.cartmaintenance.service.CartMaintService;
import com.f2c.cartmaintenance.util.ResponseBean;

@RestController
@RequestMapping("/cartmaintenance")
public class CartDetailsController {

	@Autowired
	public CartMaintService cartMaintService;

	@GetMapping("/a")
	public String getHello() {
		return "Welcome in Cart";
	}

	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public ResponseEntity<ResponseBean> addtocart(@Valid @RequestBody CartDetailBean cartDetail) {
		return cartMaintService.save(cartDetail);
	}

	@RequestMapping(value = "/getCartDetails/{userName}", method = RequestMethod.GET)
	public List<CartDetailBean> getCartDetails(@PathVariable("userName") String userName) {
		return cartMaintService.getCartDetails(userName);
	}
}
