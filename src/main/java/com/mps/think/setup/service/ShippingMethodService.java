package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.ShippingMethod;
import com.mps.think.setup.vo.ShippingMethodVO;

public interface ShippingMethodService {
	
	public List<ShippingMethod> getAllShippingMethods();
	
	public ShippingMethodVO saveShippingMethod(ShippingMethodVO shippingMethod);
	
	public ShippingMethod getShippingMehtodByid(Integer id);
	
	public ShippingMethodVO updateShippingMehtod(ShippingMethodVO shippingMethod);
	
	public ShippingMethod deleteShippingMethod(ShippingMethod shippingMethod);
	
	public ShippingMethod deleteShippingMethodById(Integer id);
	
}
