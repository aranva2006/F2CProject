package com.f2c.custmaint.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.custmaint.entity.User;
import com.f2c.custmaint.entity.beans.ContactInformation;
import com.f2c.custmaint.entity.beans.SocietyDetail;
import com.f2c.custmaint.entity.beans.UserDetails;
import com.f2c.custmaint.entity.beans.UserType;
import com.f2c.custmaint.repository.CustomerRepository;

@Service
public class CustomerComponent {
	private static final Logger logger = LoggerFactory.getLogger(CustomerComponent.class);

	CustomerRepository customerRepository;

	@Autowired
	public CustomerComponent(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public UserDetails getCustomer(String phone_number) {
		User userEntity = customerRepository.getOne(phone_number);
		UserDetails userDetails = new UserDetails();
		userDetails.setPhonenumber(userEntity.getPhone_number());
		userDetails.setFirstname(userEntity.getFirstname());
		userDetails.setLastname(userEntity.getLastname());
		
		SocietyDetail societyDetail = new SocietyDetail();
		societyDetail.setScoceityId(userEntity.getSocietyDetail().getScoceityId());
		societyDetail.setSocietyAddressLine1(userEntity.getSocietyDetail().getSocietyAddressLine1());
		societyDetail.setSocietyAddressLine2(userEntity.getSocietyDetail().getSocietyAddressLine2());
		societyDetail.setSocietyCity(userEntity.getSocietyDetail().getSocietyCity());
		societyDetail.setSocietyContact(userEntity.getSocietyDetail().getSocietyContact());
		societyDetail.setSocietyCountry(userEntity.getSocietyDetail().getSocietyCountry());
		societyDetail.setSocietyName(userEntity.getSocietyDetail().getSocietyName());
		societyDetail.setSocietyPincode(userEntity.getSocietyDetail().getSocietyPincode());
		societyDetail.setSocietyState(userEntity.getSocietyDetail().getSocietyState());
		userDetails.setSocietyDetail(societyDetail);
		
		ContactInformation contactInformation = new ContactInformation();
		contactInformation.setAddressLine1(userEntity.getContactInformation().getAddressLine1());
		contactInformation.setAddressLine2(userEntity.getContactInformation().getAddressLine2());
		contactInformation.setAlternatePhone(userEntity.getContactInformation().getAlternatePhone());
		contactInformation.setCity(userEntity.getContactInformation().getCity());
		contactInformation.setContactId(userEntity.getContactInformation().getContactId());
		contactInformation.setCountry(userEntity.getContactInformation().getCountry());
		contactInformation.setEmailId(userEntity.getContactInformation().getEmailId());
		contactInformation.setPinCode(userEntity.getContactInformation().getPinCode());
		contactInformation.setState(userEntity.getContactInformation().getState());
		userDetails.setContactInformation(contactInformation);
		
		UserType userType = new UserType();
		userType.setUserTypeId(userEntity.getUserType().getUserTypeId());
		userType.setUserTypeCode(userEntity.getUserType().getUserTypeCode());
		userType.setUserTypeDesc(userEntity.getUserType().getUserTypeDesc());
		userDetails.setUserType(userType);
		return userDetails;
	}

}





