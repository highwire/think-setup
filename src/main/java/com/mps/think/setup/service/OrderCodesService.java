package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubOrderClassMapping;

@Service
public interface OrderCodesService {
	
	public SubOrderClassMapping createOrderCodes(SubOrderClassMapping orderCodes);
	public SubOrderClassMapping updateOrderCodes(SubOrderClassMapping orderCodes);
	public List<SubOrderClassMapping> getAllOrderCodes();
	public SubOrderClassMapping getOrderByOrderClassId(Integer orderCode);

}
