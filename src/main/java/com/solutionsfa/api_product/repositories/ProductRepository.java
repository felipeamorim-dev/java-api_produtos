package com.solutionsfa.api_product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionsfa.api_product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
