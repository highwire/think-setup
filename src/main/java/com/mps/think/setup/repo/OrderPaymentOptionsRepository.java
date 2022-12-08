package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.OrderPaymentOptions;

public interface OrderPaymentOptionsRepository extends JpaRepository<OrderPaymentOptions, Integer> {
	
	public OrderPaymentOptions findByPublisherId(Integer publisherId);

}