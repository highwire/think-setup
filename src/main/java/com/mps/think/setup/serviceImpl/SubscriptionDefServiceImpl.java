package com.mps.think.setup.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.SubscriptionDefKeyInfo;
import com.mps.think.setup.model.SubscriptionItemDetails;
import com.mps.think.setup.repo.SubscriptionDefKeyInfoRepo;
import com.mps.think.setup.repo.SubscriptionItemDetailsRepo;
import com.mps.think.setup.service.SubscriptionDefService;
import com.mps.think.setup.vo.SubscriptionDefKeyInfoVO;
import com.mps.think.setup.vo.SubscriptionDefinationVO;
import com.mps.think.setup.vo.SubscriptionItemDetailsVO;

@Service
public class SubscriptionDefServiceImpl implements SubscriptionDefService {
		
	@Autowired
	private SubscriptionDefKeyInfoRepo keyInfoRepo;
	
	@Autowired
	private SubscriptionItemDetailsRepo itemDetailsRepo;
	
	@Override
	public SubscriptionDefinationVO createSubscriptionDefination(SubscriptionDefinationVO subscriptionDef) {
		ObjectMapper mapper=  new ObjectMapper();
		keyInfoRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getKeyInfo(), SubscriptionDefKeyInfo.class));
		itemDetailsRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getItemDetails(), SubscriptionItemDetails.class));
		return subscriptionDef;
	}

	@Override
	public SubscriptionDefinationVO updateSubscriptionDefination(SubscriptionDefinationVO subscriptionDef) {
		ObjectMapper mapper=  new ObjectMapper();
		keyInfoRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getKeyInfo(), SubscriptionDefKeyInfo.class));
		itemDetailsRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getItemDetails(), SubscriptionItemDetails.class));
		return subscriptionDef;
	}

	@Override
	public Map<String, Object> getSubscriptionDefByPublisherId(Integer id) {
		Map<String, Object> mp = new HashMap<>();
		List<SubscriptionDefKeyInfo> keyInfo = keyInfoRepo.findByPublisherId(id);
		List<SubscriptionItemDetails> itemDetails = itemDetailsRepo.findByPublisherId(id);
		mp.put("keyInfo", keyInfo);
		mp.put("itemDetails", itemDetails);
		return mp;
	}
	
	@Override
	public SubscriptionDefKeyInfo getSubscriptionDefKeyInfoById(Integer id) {
		Optional<SubscriptionDefKeyInfo> keyInfo = keyInfoRepo.findById(id);
		return keyInfo.isPresent() ? keyInfo.get() : null;
	}
	
	@Override
	public SubscriptionItemDetails getSubscriptionItemDetailsById(Integer id) {
		Optional<SubscriptionItemDetails> itemDetail = itemDetailsRepo.findById(id);
		return itemDetail.isPresent() ? itemDetail.get() : null;
	}

	@Override
	public List<SubscriptionDefKeyInfo> getAllOrderCodesUnderSubDef() {
		return keyInfoRepo.findAll();
	}

	@Override
	public SubscriptionDefinationVO deleteSubscriptionDefinationById(Integer id) {
		
		Optional<SubscriptionDefKeyInfo> keyInfo = keyInfoRepo.findById(id);
		Optional<SubscriptionItemDetails> itemDetails = itemDetailsRepo.findById(id);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		SubscriptionDefinationVO deletedSubscription = new SubscriptionDefinationVO();
		
		if (keyInfo.isPresent()) {
			deletedSubscription.setKeyInfo(mapper.convertValue(keyInfo.get(), SubscriptionDefKeyInfoVO.class));
			keyInfoRepo.delete(keyInfo.get());
		}
		if (itemDetails.isPresent()) {
			deletedSubscription.setItemDetails(mapper.convertValue(itemDetails.get(), SubscriptionItemDetailsVO.class));
			itemDetailsRepo.delete(itemDetails.get());
		}
		
		return deletedSubscription;
		
	}
	
}
