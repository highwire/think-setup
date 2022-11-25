package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubscriptionCategories;

@Service
public interface SubscriptionCategoriesService {
	public List<SubscriptionCategories> findAllSubscriptionCategories()throws Exception;

	public SubscriptionCategories saveSubscriptionCategories(SubscriptionCategories SubscriptionCategories)throws Exception;

	public SubscriptionCategories updateSubscriptionCategories(SubscriptionCategories SubscriptionCategories)throws Exception;

	public SubscriptionCategories findbySubscriptionCategoriesId(Integer SubscriptionCategoriesId)throws Exception;

}


