package com.f2c.custmaint.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.custmaint.entity.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Long> {
	
}
