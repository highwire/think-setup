package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SubscriptionCategory;
import com.mps.think.setup.vo.SubscriptionCategoryVO;

public interface SubscriptionCategoryService {
	
	public List<SubscriptionCategory> findAllSubscriptionCategory();

	public SubscriptionCategoryVO saveSubscriptionCategory(SubscriptionCategoryVO subscriptionCategory);

	public SubscriptionCategoryVO updateSubscriptionCategory(SubscriptionCategoryVO subscriptionCategory);

	public SubscriptionCategory findbyId(Integer Id);

}
