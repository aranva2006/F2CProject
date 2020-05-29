package com.f2c.prodmaint.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.f2c.prodmaint.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
	/*
	 * @Query(value = "SELECT * FROM  Product P\n" +
	 * "INNER JOIN Product_stock PS ON P.product_id = PS.product_id \n" +
	 * "INNER JOIN Product_Category PC ON P.product_category_id = PC.product_category_id\n"
	 * + "where p.product_code = ?1", nativeQuery = true)
	 */
	Product findProductByProductCode(String productCode);
}
