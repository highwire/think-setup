package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.OrderPackageOptions;

public interface OrderPackageOptionsRepository extends JpaRepository<OrderPackageOptions, Integer> {
	
	public List<OrderPackageOptions> findByPublisherId(Integer publisherId);

}