package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SubscriptionCategories;

@Repository
public interface SubscriptionCategoriesRepo extends JpaRepository<SubscriptionCategories, Integer> {

}
