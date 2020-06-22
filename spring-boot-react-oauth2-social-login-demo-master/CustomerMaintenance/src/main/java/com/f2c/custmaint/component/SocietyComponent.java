package com.f2c.custmaint.component;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.custmaint.entity.beans.SocietyDetail;
import com.f2c.custmaint.repository.SocietyRepository;

@Service
public class SocietyComponent {
	private static final Logger logger = LoggerFactory.getLogger(SocietyComponent.class);
	private SocietyRepository societyRepository;

	@Autowired
	public SocietyComponent(SocietyRepository societyRepository) {
		this.societyRepository = societyRepository;
	}

	public List<SocietyDetail> getAllSocietyDetails() {
		List<com.f2c.custmaint.entity.SocietyDetail> societyList = societyRepository.findAll();
		List<SocietyDetail> societyDetailList = new ArrayList<SocietyDetail>();
		for (com.f2c.custmaint.entity.SocietyDetail societyDetail : societyList) {
			societyDetailList.add(getSociety(societyDetail));
		}
		return societyDetailList;
	}

	private SocietyDetail getSociety(com.f2c.custmaint.entity.SocietyDetail societyDetail) {
		SocietyDetail society = new SocietyDetail();
		society.setScocietyId(societyDetail.getScoceityId());
		society.setSocietyName(societyDetail.getSocietyName());
		society.setSocietyAddressLine1(societyDetail.getSocietyAddressLine1());
		society.setSocietyAddressLine2(societyDetail.getSocietyAddressLine2());
		society.setSocietyCity(societyDetail.getSocietyCity());
		society.setSocietyContact(societyDetail.getSocietyContact());
		society.setSocietyCountry(societyDetail.getSocietyCountry());
		society.setSocietyPincode(societyDetail.getSocietyPincode());
		society.setSocietyState(societyDetail.getSocietyState());
		return society;
	}

}
