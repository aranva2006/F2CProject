package com.f2c.social.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.f2c.prodmaint.entity.beans.SocietyDetail;

@Service
public class SocietyServiceImpl implements SocietyService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<SocietyDetail> getSocietyList() {
		ResponseEntity<List<SocietyDetail>> response = restTemplate.exchange(
				"http://localhost:8060/custmaint/getAllSocieties", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<SocietyDetail>>() {
				});
		return response.getBody();
	}
}
