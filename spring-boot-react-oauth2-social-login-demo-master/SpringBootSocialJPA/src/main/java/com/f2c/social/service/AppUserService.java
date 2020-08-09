package com.f2c.social.service;

import com.f2c.prodmaint.entity.beans.ProfileInfo;
import com.f2c.prodmaint.entity.beans.UserInfo;

public interface AppUserService {
	public ProfileInfo updateAppUser(ProfileInfo profileInfo);
	public ProfileInfo getProfileInfo(String userName);
}
