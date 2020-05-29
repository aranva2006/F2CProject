package com.f2c.prodmaint.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.prodmaint.entity.Product;
import com.f2c.prodmaint.repository.ProductRepository;

@Service
public class ProductComponent {
	private static final Logger logger = LoggerFactory.getLogger(ProductComponent.class);

	ProductRepository productRepository;

	@Autowired
	public ProductComponent(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProduct(String productCode) {
		return productRepository.findProductByProductCode(productCode);
	}
	
	public List<Product> getAllActiveProducts() {
		return productRepository.findAll();
	}
	
}





