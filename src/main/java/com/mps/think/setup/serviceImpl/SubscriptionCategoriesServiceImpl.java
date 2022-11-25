package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubscriptionCategories;
import com.mps.think.setup.repo.SubscriptionCategoriesRepo;
import com.mps.think.setup.service.SubscriptionCategoriesService;

@Service
public class SubscriptionCategoriesServiceImpl implements SubscriptionCategoriesService{

	@Autowired
	SubscriptionCategoriesRepo subscriptionCategoriesRepo;

	@Override
	public List<SubscriptionCategories> findAllSubscriptionCategories() throws Exception {
		return subscriptionCategoriesRepo.findAll();
	}

	@Override
	public SubscriptionCategories saveSubscriptionCategories(SubscriptionCategories subscriptionCategories)
			throws Exception {
		SubscriptionCategories newEntry = new SubscriptionCategories();
		newEntry.setSubscriptionCategoriesId(subscriptionCategories.getSubscriptionCategoriesId());
		newEntry.setSubscriptionCategory(subscriptionCategories.getSubscriptionCategory());
		newEntry.setDescription(subscriptionCategories.getDescription());
		subscriptionCategoriesRepo.saveAndFlush(newEntry);
		return newEntry;
	}

	@Override
	public SubscriptionCategories updateSubscriptionCategories(SubscriptionCategories subscriptionCategories)
			throws Exception {
		SubscriptionCategories subsid=subscriptionCategoriesRepo.findById(subscriptionCategories.getSubscriptionCategoriesId()).get();
		for(SubscriptionCategories curr : subscriptionCategoriesRepo.findAll()) {
//			if (curr.getSubscriptionCategoriesId().equals(subscriptionCategories.getSubscriptionCategoriesId())) {
//				curr.setSubscriptionCategory(subscriptionCategories.getSubscriptionCategory());
//				curr.setDescription(subscriptionCategories.getDescription());
//				return curr;
//			}
			subsid.setSubscriptionCategory(subscriptionCategories.getSubscriptionCategory());
			subsid.setDescription(subscriptionCategories.getDescription());
			subsid=subscriptionCategoriesRepo.save(subsid);
		}
		return subsid;
	}

	@Override
	public SubscriptionCategories findbySubscriptionCategoriesId(Integer subscriptionCategoriesId) throws Exception {
		SubscriptionCategories subsid=subscriptionCategoriesRepo.findById(subscriptionCategoriesId).get();
//		for(SubscriptionCategories curr : subscriptionCategoriesRepo.findAll()) {
//			if (curr.getSubscriptionCategoriesId().equals(subscriptionCategoriesId)) {
//				return curr;
//			}
//		}
		return subsid;
	}

}
