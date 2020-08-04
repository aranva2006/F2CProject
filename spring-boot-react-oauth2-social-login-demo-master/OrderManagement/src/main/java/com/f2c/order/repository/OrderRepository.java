package com.f2c.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.order.entity.CustomerOrder;

public interface OrderRepository extends JpaRepository<CustomerOrder, String> {
	List<CustomerOrder> findCustomerOrderByMailId(String mailId);
}
