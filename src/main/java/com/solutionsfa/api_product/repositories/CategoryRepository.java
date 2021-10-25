package com.solutionsfa.api_product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionsfa.api_product.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
