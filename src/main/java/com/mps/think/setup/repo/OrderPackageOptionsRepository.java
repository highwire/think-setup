package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.OrderPackageOptions;

public interface OrderPackageOptionsRepository extends JpaRepository<OrderPackageOptions, Integer> {
	
	public OrderPackageOptions findByPublisherId(Integer publisherId);

}