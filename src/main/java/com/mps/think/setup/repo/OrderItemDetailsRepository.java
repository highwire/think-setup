package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.OrderItemDetails;

public interface OrderItemDetailsRepository extends JpaRepository<OrderItemDetails, Integer> {
	
	public OrderItemDetails findByPublisherId(Integer publisherId);

}
