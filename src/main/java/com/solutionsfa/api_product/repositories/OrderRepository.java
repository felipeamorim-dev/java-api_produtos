package com.solutionsfa.api_product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionsfa.api_product.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
