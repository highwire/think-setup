package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.model.OrderCategory;
import com.mps.think.setup.vo.CustomerCategoryVO;
import com.mps.think.setup.vo.OrderCategoryVO;

public interface OrderCategoryService {
	

	public List<OrderCategory> findAllOrderCategory();
	
	public OrderCategoryVO saveOrderCategory(OrderCategoryVO orderCategory);
	
	public OrderCategoryVO updateOrderCategory(OrderCategoryVO orderCategory);
	
	public OrderCategory findbyOrderCategoryId(Integer orderCategoryId);
	
	public OrderCategory deleteByOrderCategoryId(Integer orderCategoryId);


}
