package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.DeliveryMethodOverrides;

@Repository
public interface DeliveryMethodOverridesRepo extends JpaRepository<DeliveryMethodOverrides, Integer> {

	DeliveryMethodOverrides findDeliveryMethodOverrideById(Integer id);

}
