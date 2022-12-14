package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.OrderCategory;

@Repository
public interface OrderCategoryRepo extends JpaRepository<OrderCategory ,Integer> {
	public OrderCategory findByOrderCategoryId(Integer orderCategoryId);
}
