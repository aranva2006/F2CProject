package com.f2c.prodmaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.prodmaint.component.ProductComponent;
import com.f2c.prodmaint.entity.beans.ProductDetails;

@RestController
@CrossOrigin
@RequestMapping("/prodmaint")
public class ProductController {
	ProductComponent productComponent;
	
	@Autowired
	ProductController(ProductComponent productComponent){
		this.productComponent = productComponent;
	}

	@RequestMapping(value="/activeProducts" , method = RequestMethod.GET)
	public List<ProductDetails> getAllActiveProducts(){
		return productComponent.getAllActiveProducts();
	}
	
	@RequestMapping(value="/getProduct/{productCode}" , method = RequestMethod.GET)
	public ProductDetails getProduct(@PathVariable String productCode){
		return productComponent.getProductDetails(productCode);
	}	
}
