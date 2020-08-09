package com.f2c.CartDetailsManagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.CartDetailsManagement.entity.CartEntity;
import com.f2c.CartDetailsManagement.service.inf.CartServiceinf;
import com.f2c.CartDetailsManagement.util.ResponseBean;

@RestController
@RequestMapping("cart")
public class CartDetailsController {

	@Autowired
	public CartServiceinf cartserviceinf;
	
 	@GetMapping("/a")
	public String getHello() {
		return "Welcome in Cart";
	}
 	
	
	  @PostMapping("/addtocart") 
	  public ResponseEntity<ResponseBean>
	  addtocart(@Valid @RequestBody CartEntity cartentity) { 
		  // return
		  return  cartserviceinf.save(cartentity); 
	  //return null; 
	  }
	 
 	
}
