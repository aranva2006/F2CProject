package com.f2c.custmaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.f2c.custmaint.entity.SocietyDetail;

public interface SocietyRepository extends JpaRepository<SocietyDetail, Integer> {

}
