package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubscriptionCategories;
import com.mps.think.setup.repo.SubscriptionCategoriesRepo;
import com.mps.think.setup.service.SubscriptionCategoriesService;
import com.mps.think.setup.vo.SubscriptionCategoriesVO;

@Service
public class SubscriptionCategoriesServiceImpl implements SubscriptionCategoriesService {

	@Autowired
	SubscriptionCategoriesRepo subscriptionCategoriesRepo;

	@Override
	public List<SubscriptionCategories> findAllSubscriptionCategories() {
		return subscriptionCategoriesRepo.findAll();
	}

	@Override
	public SubscriptionCategoriesVO saveSubscriptionCategories(SubscriptionCategoriesVO SubscriptionCategories)
			 {
		SubscriptionCategories newEntry = new SubscriptionCategories();
		newEntry.setSubscriptionCategoriesId(SubscriptionCategories.getSubscriptionCategoriesId());
		newEntry.setSubscriptionCategory(SubscriptionCategories.getSubscriptionCategory());
		newEntry.setDescription(SubscriptionCategories.getDescription());
		subscriptionCategoriesRepo.saveAndFlush(newEntry);
		return SubscriptionCategories;
	}

	@Override
	public SubscriptionCategoriesVO updateSubscriptionCategories(SubscriptionCategoriesVO SubscriptionCategories)
			 {
		

		for (SubscriptionCategories curr : subscriptionCategoriesRepo.findAll()) {
			if (curr.getSubscriptionCategoriesId().equals(SubscriptionCategories.getSubscriptionCategoriesId())) {
				curr.setDescription(SubscriptionCategories.getDescription());
				curr.setSubscriptionCategory(SubscriptionCategories.getSubscriptionCategory());
				subscriptionCategoriesRepo.saveAndFlush(curr);
				return SubscriptionCategories;
			}
		}
		return null;

	}

	@Override
	public SubscriptionCategories findbySubscriptionCategoriesId(Integer SubscriptionCategoriesId) {
		for (SubscriptionCategories curr : subscriptionCategoriesRepo.findAll()) {
			if (curr.getSubscriptionCategoriesId().equals(SubscriptionCategoriesId)) {
				return curr;
			}
		}
		return null;
	}

	

}
