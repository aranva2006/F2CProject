package com.f2c.custmaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.f2c.custmaint.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
	@Query("UPDATE AppUser au SET au.firstName = :firstName, au.lastName = :lastName , au.phone = :phone, au.societyId = :societyId WHERE au.userName = :userName")
	void updateProfileInfo(@Param("userName") String userName, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("phone") String phone, @Param("societyId") String societyId);

	AppUser getAppUserByUserName(String userName);
}
