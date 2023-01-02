package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.vo.OrderClassVO;

public interface OrderClassService {

	public List<OrderClass> findAllOrderClass();
	
	public OrderClassVO saveOrderClass(OrderClassVO orderClassVO);
	
	public OrderClassVO updateOrderClass(OrderClassVO orderClassVO);
	
	public OrderClass findbyOrderClassId(Integer orderClassId);
}
