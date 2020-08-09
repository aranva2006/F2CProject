package com.f2c.custmaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.f2c.custmaint.entity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	@Query("UPDATE AppUser au SET au.firstName = :firstName, au.lastName = :lastName , au.phone = :phone, au.societyId = :societyId WHERE au.userName = :userName")
	void updateProfileInfo(@Param("userName") String userName, @Param("firstName") String firstName,
			@Param("lastName") String lastName, @Param("phone") String phone, @Param("societyId") String societyId);

	@Query("SELECT au FROM AppUser au where au.userName = :userName")
	public AppUser findOneByUserName(@Param("userName") String userName);

	public AppUser findOneByPhone(String phone);
}
