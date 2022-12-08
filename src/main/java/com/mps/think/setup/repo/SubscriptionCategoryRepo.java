package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.SubscriptionCategory;

public interface SubscriptionCategoryRepo extends JpaRepository<SubscriptionCategory , Integer> {

}
