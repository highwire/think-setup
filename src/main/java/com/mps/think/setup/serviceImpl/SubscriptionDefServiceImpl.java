package com.mps.think.setup.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.SubscriptionDefKeyInfo;
import com.mps.think.setup.model.SubscriptionDefOrderCodes;
import com.mps.think.setup.model.SubscriptionItemDetails;
import com.mps.think.setup.repo.SubscriptionDefKeyInfoRepo;
import com.mps.think.setup.repo.SubscriptionDefOrderCodesRepo;
import com.mps.think.setup.repo.SubscriptionItemDetailsRepo;
import com.mps.think.setup.service.SubscriptionDefService;
import com.mps.think.setup.vo.SubscriptionDefinationVO;

@Service
public class SubscriptionDefServiceImpl implements SubscriptionDefService {
	
	@Autowired
	private SubscriptionDefOrderCodesRepo orderCodesRepo;
		
	@Autowired
	private SubscriptionDefKeyInfoRepo keyInfoRepo;
	
	@Autowired
	private SubscriptionItemDetailsRepo itemDetailsRepo;
	
	@Override
	public SubscriptionDefinationVO createSubscriptionDefination(SubscriptionDefinationVO subscriptionDef) {
		ObjectMapper mapper=  new ObjectMapper();
		orderCodesRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getOrderCodes(), SubscriptionDefOrderCodes.class));
		keyInfoRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getKeyInfo(), SubscriptionDefKeyInfo.class));
		itemDetailsRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getItemDetails(), SubscriptionItemDetails.class));
		return subscriptionDef;
	}

	@Override
	public SubscriptionDefinationVO updateSubscriptionDefination(SubscriptionDefinationVO subscriptionDef) {
		ObjectMapper mapper=  new ObjectMapper();
		orderCodesRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getOrderCodes(), SubscriptionDefOrderCodes.class));
		keyInfoRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getKeyInfo(), SubscriptionDefKeyInfo.class));
		itemDetailsRepo.saveAndFlush(mapper.convertValue(subscriptionDef.getItemDetails(), SubscriptionItemDetails.class));
		return subscriptionDef;
	}

	@Override
	public Map<String, Object> getSubscriptionDefByPublisherId(Integer id) {
		Map<String, Object> mp = new HashMap<>();
		List<SubscriptionDefOrderCodes> orderCodes = orderCodesRepo.findByPublisherId(id);
		List<SubscriptionDefKeyInfo> keyInfo = keyInfoRepo.findByPublisherId(id);
		List<SubscriptionItemDetails> itemDetails = itemDetailsRepo.findByPublisherId(id);
		mp.put("orderCodes", orderCodes);
		mp.put("keyInfo", keyInfo);
		mp.put("itemDetails", itemDetails);
		return mp;
	}
	
	public SubscriptionDefOrderCodes getSubscriptionDefOrderCodesById(Integer id) {
		Optional<SubscriptionDefOrderCodes> orderCode = orderCodesRepo.findById(id);
		return orderCode.isPresent() ? orderCode.get() : null;
	}

	public SubscriptionDefKeyInfo getSubscriptionDefKeyInfoById(Integer id) {
		Optional<SubscriptionDefKeyInfo> keyInfo = keyInfoRepo.findById(id);
		return keyInfo.isPresent() ? keyInfo.get() : null;
	}
	
	public SubscriptionItemDetails getSubscriptionItemDetailsById(Integer id) {
		Optional<SubscriptionItemDetails> itemDetail = itemDetailsRepo.findById(id);
		return itemDetail.isPresent() ? itemDetail.get() : null;
	}
	
}
