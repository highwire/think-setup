package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SubscriptionItemDetails;

@Repository
public interface SubscriptionItemDetailsRepo extends JpaRepository<SubscriptionItemDetails, Integer> {

	public List<SubscriptionItemDetails> findByPublisherId(Integer id);
	
}
