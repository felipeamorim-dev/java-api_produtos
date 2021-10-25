package com.solutionsfa.api_product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solutionsfa.api_product.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
