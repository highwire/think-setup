package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.OrderCodes;

@Repository
public interface OrderCodesRepository extends JpaRepository<OrderCodes, Integer>{
	
	public OrderCodes findByPublisherId(Integer publisherId);

}
