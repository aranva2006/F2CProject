package com.f2c.custmaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.custmaint.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String>{

}
