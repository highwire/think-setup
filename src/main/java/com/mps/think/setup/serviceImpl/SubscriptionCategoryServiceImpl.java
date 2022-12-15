package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.mps.think.setup.model.CommodityCodes;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.SubscriptionCategory;
import com.mps.think.setup.repo.SubscriptionCategoryRepo;
import com.mps.think.setup.service.SubscriptionCategoryService;
import com.mps.think.setup.vo.SubscriptionCategoryVO;

@Service
public class SubscriptionCategoryServiceImpl implements SubscriptionCategoryService{
	
	@Autowired
	SubscriptionCategoryRepo subscriptionCategoryRepo;

	@Override
	public List<SubscriptionCategory> findAllSubscriptionCategory() {
		List<SubscriptionCategory> scList = subscriptionCategoryRepo.findAll();
		if (scList.isEmpty()) {
			throw new NotFoundException("No Subscription Category present, please add Subscription Category!");
		}
		return scList;
	}

	@Override
	public SubscriptionCategoryVO saveSubscriptionCategory(SubscriptionCategoryVO subscriptionCategory) {
		SubscriptionCategory data = new SubscriptionCategory();
		data.setSubscriptionCategory(subscriptionCategory.getSubscriptionCategory());
		data.setDescription(subscriptionCategory.getDescription());
		subscriptionCategory.setId(data.getId());
		Publisher publisher=new Publisher();
		publisher.setId(subscriptionCategory.getPubId().getId());
		data.setPubId(publisher);
		subscriptionCategoryRepo.saveAndFlush(data);
		return subscriptionCategory ;
	}

	@Override
	public SubscriptionCategoryVO updateSubscriptionCategory(SubscriptionCategoryVO subscriptionCategory) {
		SubscriptionCategory data = new SubscriptionCategory();
		data.setId(subscriptionCategory.getId());
		Publisher publisher=new Publisher();
		publisher.setId(subscriptionCategory.getPubId().getId());
		data.setPubId(publisher);
		data.setSubscriptionCategory(subscriptionCategory.getSubscriptionCategory());
		data.setDescription(subscriptionCategory.getDescription());
		subscriptionCategoryRepo.saveAndFlush(data);
		return subscriptionCategory;
	}

	@Override
	public SubscriptionCategory findbyId(Integer id) {
		Optional<SubscriptionCategory> sc = subscriptionCategoryRepo.findById(id);
		if(!sc.isPresent()) {
			throw new NotFoundException("Subscription Category Id : "+ id +" does not exist!");
		}
		return sc.get();
	}

	

	@Override
	public SubscriptionCategory deleteSubscriptionCategoryById(Integer id) {
		SubscriptionCategory todelete = subscriptionCategoryRepo.findSubscriptionCategoryById(id);
		subscriptionCategoryRepo.delete(todelete);
		return todelete;
	}	

}
