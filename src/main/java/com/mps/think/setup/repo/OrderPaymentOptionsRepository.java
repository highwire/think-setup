package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.OrderPaymentOptions;

public interface OrderPaymentOptionsRepository extends JpaRepository<OrderPaymentOptions, Integer> {
	
	public List<OrderPaymentOptions> findByPublisherId(Integer publisherId);

}