package com.f2c.CartDetailsManagement.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f2c.CartDetailsManagement.entity.CartEntity;
import com.f2c.CartDetailsManagement.repo.CartReposatoryInf;
import com.f2c.CartDetailsManagement.service.inf.CartServiceinf;
import com.f2c.CartDetailsManagement.util.ResponseBean;

@Service
public class CartServiceImpl implements CartServiceinf {

	private static final Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);

	@Autowired
	private CartReposatoryInf cartreposatoryinf;

	@Override
	public ResponseEntity<ResponseBean> save(CartEntity cartentity) {
		logger.info("Entering inside of save method of cartDetails");
		cartreposatoryinf.save(cartentity);
		logger.info("existed inside of save method info");
		return new ResponseEntity<>(new ResponseBean(200, "Success", cartentity), HttpStatus.OK);
	}

}
