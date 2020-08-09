package com.f2c.cartmaintenance.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f2c.cartmaintenance.entity.CartDetail;

@Repository
public interface CartRepository extends JpaRepository<CartDetail, Integer> {
	List<CartDetail> getCartDetailByUserName(String userName);
}
