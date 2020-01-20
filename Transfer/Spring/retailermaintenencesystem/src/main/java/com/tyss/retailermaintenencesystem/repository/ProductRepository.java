package com.tyss.retailermaintenencesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.retailermaintenencesystem.dto.ProductBean;
import com.tyss.retailermaintenencesystem.dto.ProductResponse;

public interface ProductRepository extends JpaRepository<ProductBean, Integer> {

	public ProductBean findByproductId(int id);
}
