package com.f2c.social.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.f2c.prodmaint.entity.beans.ProfileInfo;

@Component
public class ProfileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz == ProfileInfo.class;
	}

	@Override
	public void validate(Object target, Errors errors) {

		ProfileInfo form = (ProfileInfo) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "", "First name is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "", "Last name is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "", "Phone is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "societyId", "", "societyId is required");
		
		if (errors.hasErrors()) {
			return;
		}
	}

}