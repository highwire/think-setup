package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.DeliveryMethods;

@Repository
public interface DeliveryMethodsRepo extends JpaRepository<DeliveryMethods, Integer> {

	public DeliveryMethods findByDeliveryMethodsId(Integer deliveryMethodsId);
	
}
