package com.f2c.custmaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f2c.custmaint.component.AppUserComponent;
import com.f2c.custmaint.component.CustomerComponent;
import com.f2c.custmaint.component.SocietyComponent;
import com.f2c.custmaint.entity.AppUser;
import com.f2c.custmaint.entity.beans.ProfileInfo;
import com.f2c.custmaint.entity.beans.SocietyDetail;
import com.f2c.custmaint.entity.beans.UserInfo;

@RestController
@CrossOrigin
@RefreshScope
@RequestMapping("/custmaint")
@EnableJpaRepositories
public class CustomerController {
	CustomerComponent customerComponent;
	SocietyComponent societyComponent;
	AppUserComponent appUserComponent;

	@Autowired
	CustomerController(CustomerComponent customerComponent, SocietyComponent societyComponent,
			AppUserComponent appUserComponent) {
		this.customerComponent = customerComponent;
		this.societyComponent = societyComponent;
		this.appUserComponent = appUserComponent;
	}

	@RequestMapping(value = "/getAllSocieties", method = RequestMethod.GET)
	public List<SocietyDetail> getAllSocietyDetails() {
		return societyComponent.getAllSocietyDetails();
	}

	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	public ProfileInfo updateProfileInfo(@RequestBody ProfileInfo profileInfo) {
		return appUserComponent.updateAppUser(profileInfo);
	}
	
	@RequestMapping(value = "/getUserProfile/{userName}", method = RequestMethod.GET)
	public ProfileInfo getUserProfileByUserName(@PathVariable("userName") String userName) {
		return appUserComponent.getProfileInfoByUserName(userName);
	}
	
	@RequestMapping(value = "/getUserProfileById/{id}", method = RequestMethod.GET)
	public ProfileInfo getUserProfileById(@PathVariable("id") Long id) {
		return appUserComponent.getProfileInfoById(id);
	}
	
	@RequestMapping(value = "/getUserProfileByPhone/{phone}", method = RequestMethod.GET)
	public ProfileInfo getUserProfileByPhone(@PathVariable("phone") String phone) {
		return appUserComponent.getProfileInfoByPhone(phone);
	}
}
