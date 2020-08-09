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

	public ProfileInfo updateAppUser(ProfileInfo profileInfo) {
		AppUser appUser = appUserRepository.findOneByUserName(profileInfo.getUserName());
		appUser.setFirstName(profileInfo.getFirstName());
		appUser.setLastName(profileInfo.getLastName());
		appUser.setPhone(profileInfo.getPhone());
		appUser.setSocietyId(profileInfo.getSocietyId());
		appUserRepository.save(appUser);
		return profileInfo;
	}

	public AppUser getAppUser(String userName) {
		return appUserRepository.findOneByUserName(userName);
	}

	public ProfileInfo getProfileInfoByUserName(String userName) {
		AppUser appUser = appUserRepository.findOneByUserName(userName.trim());
		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setFirstName(appUser.getFirstName());
		profileInfo.setLastName(appUser.getLastName());
		profileInfo.setPhone(appUser.getPhone());
		profileInfo.setSocietyId(appUser.getSocietyId());
		return profileInfo;
	}

	public ProfileInfo getProfileInfoById(Long id) {
		AppUser appUser = appUserRepository.findOne(id);
		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setFirstName(appUser.getFirstName());
		profileInfo.setLastName(appUser.getLastName());
		profileInfo.setPhone(appUser.getPhone());
		profileInfo.setSocietyId(appUser.getSocietyId());
		return profileInfo;
	}
	
	public ProfileInfo getProfileInfoByPhone(String id) {
		AppUser appUser = appUserRepository.findOneByPhone(id);
		ProfileInfo profileInfo = new ProfileInfo();
		profileInfo.setFirstName(appUser.getFirstName());
		profileInfo.setLastName(appUser.getLastName());
		profileInfo.setPhone(appUser.getPhone());
		profileInfo.setSocietyId(appUser.getSocietyId());
		return profileInfo;
	}
}
