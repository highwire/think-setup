package com.mps.think.setup.service;

import java.util.List;
import java.util.Map;

import com.mps.think.setup.model.SubscriptionDefKeyInfo;
import com.mps.think.setup.model.SubscriptionItemDetails;
import com.mps.think.setup.vo.SubscriptionDefinationVO;

public interface SubscriptionDefService {
	
	public SubscriptionDefinationVO createSubscriptionDefination(SubscriptionDefinationVO subscriptionDef);
	
	public SubscriptionDefinationVO updateSubscriptionDefination(SubscriptionDefinationVO subscriptionDef);
	
	public Map<String, Object> getSubscriptionDefByPublisherId(Integer publisherId);
	
	public SubscriptionDefKeyInfo getSubscriptionDefKeyInfoById(Integer keyInfoId);
	
	public SubscriptionItemDetails getSubscriptionItemDetailsById(Integer itemDetailId);
	
	// to fetch all the order codes under subscription defination
	
	public List<SubscriptionDefKeyInfo> getAllOrderCodesUnderSubDef();
	
	public SubscriptionDefinationVO deleteSubscriptionDefinationById(Integer id);
	
}
