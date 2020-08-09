package com.f2c.social.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.f2c.prodmaint.entity.beans.ProfileInfo;

@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired
	private RestTemplate customerMaintClient;

	@Override
	public ProfileInfo updateAppUser(ProfileInfo profileInfo) {
		return customerMaintClient.postForObject("http://localhost:8060/customer-service/custmaint/updateProfile",
				profileInfo, ProfileInfo.class);
	}

	@Override
	public ProfileInfo getProfileInfo(String userName) {
		return customerMaintClient.getForObject(
				"http://localhost:8060/customer-service/custmaint/getUserProfile/{userName}", ProfileInfo.class,
				userName);
	}

}
