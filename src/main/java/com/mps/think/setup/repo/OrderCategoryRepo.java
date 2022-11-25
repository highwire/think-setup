package com.mps.think.setup.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.OrderCategory;

@Repository
public interface OrderCategoryRepo extends JpaRepository<OrderCategory , Integer> {
	
//	Optional<OrderCategory> findById(Integer Id);

}
