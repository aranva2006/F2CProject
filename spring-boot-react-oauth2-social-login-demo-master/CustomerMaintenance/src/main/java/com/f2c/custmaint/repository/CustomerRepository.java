package com.f2c.custmaint.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.custmaint.entity.User;

public interface CustomerRepository extends JpaRepository<User, String> {
	//List<User> findCustomerByScoceityId(String scoceityId);
}
