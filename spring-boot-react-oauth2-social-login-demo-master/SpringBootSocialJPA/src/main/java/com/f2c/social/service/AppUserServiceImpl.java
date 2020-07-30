package com.f2c.social.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.f2c.prodmaint.entity.beans.ProfileInfo;

public class AppUserServiceImpl implements AppUserService {
	@Autowired
	private RestTemplate restTemplate;

	public ProfileInfo updateAppUser(ProfileInfo profileInfo) {
		HttpEntity<ProfileInfo> request = new HttpEntity<>(profileInfo);
		ResponseEntity<ProfileInfo> response = restTemplate.exchange("http://localhost:8060/custmaint/updateProfile",
				HttpMethod.POST, request, new ParameterizedTypeReference<ProfileInfo>() {
				});
		return response.getBody();
	}
}
