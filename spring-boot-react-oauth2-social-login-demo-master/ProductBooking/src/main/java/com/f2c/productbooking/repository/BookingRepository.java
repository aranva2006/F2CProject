package com.f2c.productbooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.productbooking.entity.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Long> {
	
}
