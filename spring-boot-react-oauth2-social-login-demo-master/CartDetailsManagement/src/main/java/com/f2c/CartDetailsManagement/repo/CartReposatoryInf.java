package com.f2c.CartDetailsManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f2c.CartDetailsManagement.entity.CartEntity;

@Repository
public interface CartReposatoryInf extends  JpaRepository<CartEntity, Integer> {



}
