package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.DeliveryMethods;
import com.mps.think.setup.vo.DeliveryMethodsVO;

public interface DeliveryMethodsService {

	public DeliveryMethodsVO saveDeliveryMethod(DeliveryMethodsVO delivery);
	
	public List<DeliveryMethods> getAllDeliveryMethods();
	
	public DeliveryMethodsVO updateDeliveryMethod(DeliveryMethodsVO delivery);
	
	public DeliveryMethods getDeliveryMethodById(Integer deliveryMethodsId);
	
	public DeliveryMethodsVO deleteDeliveryMethod(DeliveryMethodsVO delivery);
	
}
