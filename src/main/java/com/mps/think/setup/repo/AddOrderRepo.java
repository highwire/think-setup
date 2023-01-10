package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.Order;

@Repository
public interface AddOrderRepo extends JpaRepository<Order, Integer> {
	
	public List<Order> findAllByCustomerId(Integer customerId) throws Exception;

}
