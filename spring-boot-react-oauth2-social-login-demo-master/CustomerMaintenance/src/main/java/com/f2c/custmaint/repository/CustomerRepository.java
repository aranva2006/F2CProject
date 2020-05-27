package com.f2c.custmaint.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.custmaint.entity.User;

public interface CustomerRepository extends JpaRepository<User, String> {
	List<User> findCustomerBySocietyId(String soceityId);
}
