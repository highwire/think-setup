package com.mps.think.setup.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.OrderCodes;
import com.mps.think.setup.model.OrderItemDetails;
import com.mps.think.setup.model.OrderOptions;
import com.mps.think.setup.model.OrderPackageOptions;
import com.mps.think.setup.model.OrderPaymentOptions;
import com.mps.think.setup.vo.OrderClassVO;
import com.mps.think.setup.vo.OrderCodesVO;

@Service
public interface OrderCodesService {
	
	public OrderClassVO createOrderCodes(OrderClassVO orderCodes);
	public OrderClassVO updateOrderCodes(OrderClassVO orderCodes);
	public Map<String, Object> getOrderByPublisherId(Integer publisherId);

	public OrderCodes getOrderCodesById(Integer orderCodeID);
	public OrderItemDetails getOrderItemDetailsById(Integer itemDetailsId);
	public OrderOptions getOrderOptionsById(Integer orderOptionsId);
	public OrderPackageOptions getOrderPackageOptionsById(Integer orderPkgId);
	public OrderPaymentOptions getOrderPaymentOptionsById(Integer orderPaymentId);
	
	// to fetch the record of all order codes...
	public List<OrderCodes> getAllOrderCodes();
	
	// to delete the order
	public OrderClassVO deleteOrderCode(Integer id);
	
}
