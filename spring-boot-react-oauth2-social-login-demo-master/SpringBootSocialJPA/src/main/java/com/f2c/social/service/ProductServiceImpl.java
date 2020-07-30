package com.f2c.social.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.f2c.prodmaint.entity.beans.ProductDetails;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<ProductDetails> getProductList() {
		ResponseEntity<List<ProductDetails>> response = restTemplate.exchange(
				"http://localhost:8009/prodmaint/activeProducts", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProductDetails>>() {
				});
		return response.getBody();
	}

}
