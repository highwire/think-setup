package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubscriptionCategories;
import com.mps.think.setup.vo.SubscriptionCategoriesVO;

@Service
public interface SubscriptionCategoriesService {
	public List<SubscriptionCategories> findAllSubscriptionCategories();

	public SubscriptionCategoriesVO saveSubscriptionCategories(SubscriptionCategoriesVO SubscriptionCategories);

	public SubscriptionCategoriesVO updateSubscriptionCategories(SubscriptionCategoriesVO SubscriptionCategories);

	public SubscriptionCategories findbySubscriptionCategoriesId(Integer SubscriptionCategoriesId);
}


