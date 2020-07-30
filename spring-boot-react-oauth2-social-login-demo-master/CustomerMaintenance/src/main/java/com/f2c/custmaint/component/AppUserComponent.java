package com.f2c.custmaint.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.custmaint.entity.AppUser;
import com.f2c.custmaint.entity.beans.ProfileInfo;
import com.f2c.custmaint.repository.AppUserRepository;

@Service
public class AppUserComponent {
	private static final Logger logger = LoggerFactory.getLogger(AppUserComponent.class);

	AppUserRepository appUserRepository;

	@Autowired
	public AppUserComponent(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}
	
	public ProfileInfo updateAppUser(ProfileInfo profile) {
		AppUser appUser = new AppUser();
		appUser.setFirstName(profile.getFirstName());
		appUser.setLastName(profile.getLastName());
		appUser.setPhone(profile.getPhone());
		appUser.setSocietyId(profile.getSocietyId());
		appUser.setUserTypeId(1);
		appUserRepository.save(appUser);
		return profile;
	}

}
