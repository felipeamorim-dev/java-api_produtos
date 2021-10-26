package com.solutionsfa.api_product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionsfa.api_product.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
