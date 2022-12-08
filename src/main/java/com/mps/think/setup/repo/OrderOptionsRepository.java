package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.OrderOptions;

public interface OrderOptionsRepository extends JpaRepository<OrderOptions, Integer> {
	
	public OrderOptions findByPublisherId(Integer publisherId);

}