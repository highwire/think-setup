package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.ShippingMethod;

@Repository
public interface ShippingMethodRepo extends JpaRepository<ShippingMethod, Integer> {

	public ShippingMethod findShippingMethodById(Integer id);
	
}
