package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.DeliveryMethodOverrides;
import com.mps.think.setup.vo.DeliveryMethodOverridesVO;

public interface DeliveryMethodOverridesService {

	public List<DeliveryMethodOverrides> getAllDeliveryMethodOverrides();
	
	public DeliveryMethodOverridesVO saveDeliveryMethodOverrides(DeliveryMethodOverridesVO deliveryMethodOverride);
	
	public DeliveryMethodOverrides getDeliveryMethodOverrideById(Integer id);
	
	public DeliveryMethodOverridesVO updateDeliveryMethodOverrides(DeliveryMethodOverridesVO deliveryMethod);
	
	public DeliveryMethodOverrides deleteDeliveryMethodOverrideById(Integer id);
	
}
