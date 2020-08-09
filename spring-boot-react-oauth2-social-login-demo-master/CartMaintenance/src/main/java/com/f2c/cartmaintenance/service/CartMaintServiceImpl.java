package com.f2c.cartmaintenance.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.f2c.cartmaintenance.beans.CartDetailBean;
import com.f2c.cartmaintenance.entity.CartDetail;
import com.f2c.cartmaintenance.repo.CartRepository;
import com.f2c.cartmaintenance.util.ResponseBean;

@Service
public class CartMaintServiceImpl implements CartMaintService {

	private static final Logger logger = LoggerFactory.getLogger(CartMaintServiceImpl.class);

	@Autowired
	private CartRepository cartRepository;

	@Override
	public ResponseEntity<ResponseBean> save(CartDetailBean cartDetailBean) {
		logger.info("Entering inside of save method of cartDetails");
		CartDetail cartDetailEntity = new CartDetail();
		cartDetailEntity.setQuantity(cartDetailBean.getQuantity());
		cartDetailEntity.setProductId(cartDetailBean.getProductId());
		cartDetailEntity.setUserName(cartDetailBean.getUserName());
		cartRepository.save(cartDetailEntity);
		logger.info("existed inside of save method info");
		return new ResponseEntity<>(new ResponseBean(200, "Success", cartDetailBean), HttpStatus.OK);
	}

	@Override
	public List<CartDetailBean> getCartDetails(String userName) {
		List<CartDetail> cartDetailsList = cartRepository.getCartDetailByUserName(userName);
		for() {
		}
		return null;
	}

}
