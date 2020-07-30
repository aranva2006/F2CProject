package com.f2c.custmaint.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.custmaint.entity.AppUser;
import com.f2c.custmaint.entity.CustomerOrder;
import com.f2c.custmaint.entity.User;
import com.f2c.custmaint.entity.beans.ContactInformation;
import com.f2c.custmaint.entity.beans.CustomerOrderDetails;
import com.f2c.custmaint.entity.beans.CustomerOrderInfo;
import com.f2c.custmaint.entity.beans.ProfileInfo;
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
	
	public ProfileInfo updateAppUser(ProfileInfo profile) {
		profile.getFirstName();
		AppUser appUser = new AppUser();
		appUser.setFirstName(profile.getFirstName());
		appUser.setLastName(profile.getLastName());
		appUser.setPhone(profile.getPhone());
		appUser.setSocietyId(profile.getSocietyId());
		appUser.setUserTypeId(1);
		return profile;
	}

	public UserDetails getCustomer(String phone_number) {
		User userEntity = customerRepository.getOne(phone_number);
		UserDetails userDetails = new UserDetails();
		userDetails.setEmailId(userEntity.getMailId());
		userDetails.setFirstName(userEntity.getFirstname());
		userDetails.setLastName(userEntity.getLastname());

		SocietyDetail societyDetail = new SocietyDetail();
		societyDetail.setScocietyId(userEntity.getSocietyDetail().getScoceityId());
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

		Set<CustomerOrder> customerOrders = userEntity.getCustomerOrders();
		List<CustomerOrderDetails> customerOrderDetails = new ArrayList<>();
		List<CustomerOrderInfo> customerOrderInfos = new ArrayList<>();
		for (CustomerOrder order : customerOrders) {
			CustomerOrderDetails orderHistory = new CustomerOrderDetails();
			orderHistory.setOrderId(order.getOrderId());
			orderHistory.setScocietyId(order.getScocietyId());
			orderHistory.setOrderDate(order.getOrderDate());
			orderHistory.setPaymentDetailId(order.getPaymentDetailId());
			orderHistory.setOrderState(order.getOrderState());
			orderHistory.setOrderAmount(order.getOrderAmount());
			for (com.f2c.custmaint.entity.CustomerOrderInfo orderInfo : order.getCustomerOrderInfos()) {
				CustomerOrderInfo customerOrderInfo = new CustomerOrderInfo();
				customerOrderInfo.setOrderInfoId(orderInfo.getOrderInfoId());
				customerOrderInfo.setProductId(orderInfo.getProductId());
				customerOrderInfo.setProductAmount(orderInfo.getProductAmount());
				customerOrderInfo.setStatus(orderInfo.getDeliveryStatus());
				customerOrderInfo.setDeliveryStatus(orderInfo.getDeliveryStatus());
				customerOrderInfo.setDeliveryDate(orderInfo.getDeliveryDate());
				customerOrderInfos.add(customerOrderInfo);
			}
			orderHistory.setCustomerOrders(customerOrderInfos);
			customerOrderDetails.add(orderHistory);
			userDetails.setCustomerOrderDetails(customerOrderDetails);
		}
		return userDetails;
	}


}
