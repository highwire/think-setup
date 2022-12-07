package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.ShippingPriceList;
import com.mps.think.setup.vo.ShippingPriceListVO;

public interface ShippingPriceListService {
	
	public List<ShippingPriceList> findAllShippingPriceList();
	
	public ShippingPriceListVO saveShippingPriceList(ShippingPriceListVO shippingPriceList);
	
	public ShippingPriceList findShippingPriceListById(Integer id);
	
	public ShippingPriceListVO updateShippingPriceList(ShippingPriceListVO shippingPriceList);
	
	public ShippingPriceList deleteShippingPriceListById(Integer id);
	
}
