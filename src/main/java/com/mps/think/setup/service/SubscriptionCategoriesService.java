package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubscriptionCategories;
import com.mps.think.setup.vo.SubscriptionCategoriesVO;

@Service
public interface SubscriptionCategoriesService {
	public List<SubscriptionCategories> findAllSubscriptionCategories()throws Exception;

	public SubscriptionCategoriesVO saveSubscriptionCategories(SubscriptionCategoriesVO SubscriptionCategories)throws Exception;

	public SubscriptionCategoriesVO updateSubscriptionCategories(SubscriptionCategoriesVO SubscriptionCategories)throws Exception;

	public SubscriptionCategories findbySubscriptionCategoriesId(Integer SubscriptionCategoriesId)throws Exception;
}


