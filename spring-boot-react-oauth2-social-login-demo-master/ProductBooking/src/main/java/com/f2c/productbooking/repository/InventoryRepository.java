package com.f2c.productbooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.productbooking.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	Inventory findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
	
}
