package com.f2c.custmaint.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.custmaint.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	Inventory findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
	
}
