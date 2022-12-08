package com.mps.think.setup.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.mps.think.setup.vo.OrderClassVO;

@Service
public interface OrderCodesService {
	
	public OrderClassVO createOrderCodes(OrderClassVO orderCodes);
	public OrderClassVO updateOrderCodes(OrderClassVO orderCodes);
	public Map<String, Object> getOrderByPublisherId(Integer publisherId);

}
