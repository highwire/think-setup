package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.OrderCategory;

import com.mps.think.setup.vo.OrderCategoryVo;


public interface OrderCategoryService {
	
    public List<OrderCategory> findAllOrderCategory();
	
	public OrderCategoryVo saveOrderCategory(OrderCategoryVo orderCategoryVo);
	
	public OrderCategoryVo updateOrderCategory(OrderCategoryVo orderCategoryVo);

	public OrderCategory findbyOrderCategoryId(Integer orderCategoryId);

}
