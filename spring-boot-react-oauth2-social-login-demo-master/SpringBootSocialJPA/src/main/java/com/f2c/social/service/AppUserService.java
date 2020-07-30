package com.f2c.social.service;

import org.springframework.stereotype.Service;

import com.f2c.prodmaint.entity.beans.ProfileInfo;
import com.f2c.prodmaint.entity.beans.UserInfo;

@Service
public interface AppUserService {
	public ProfileInfo updateAppUser(UserInfo userInfo);
}
