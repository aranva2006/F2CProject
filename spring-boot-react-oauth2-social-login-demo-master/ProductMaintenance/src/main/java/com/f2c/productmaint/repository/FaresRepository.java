package com.f2c.productmaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.productmaint.entity.Fare;

public interface FaresRepository extends JpaRepository<Fare,Long> {
	Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
