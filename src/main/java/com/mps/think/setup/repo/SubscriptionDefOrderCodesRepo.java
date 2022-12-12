package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SubscriptionDefOrderCodes;

@Repository
public interface SubscriptionDefOrderCodesRepo extends JpaRepository<SubscriptionDefOrderCodes, Integer> {

	public List<SubscriptionDefOrderCodes> findByPublisherId(Integer id);
	
}
