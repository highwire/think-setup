package com.mps.think.setup.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.OrderCategory;

import com.mps.think.setup.repo.OrderCategoryRepo;

import com.mps.think.setup.service.OrderCategoryService;
import com.mps.think.setup.vo.OrderCategoryVo;



@Service
public class OrderCategoryServiceImpl implements  OrderCategoryService{
	
	@Autowired
	OrderCategoryRepo orderCategoryRepo;
	
	@Override
	public List<OrderCategory> findAllOrderCategory() {
		return orderCategoryRepo.findAll();
	}
	
	@Override
	public OrderCategoryVo saveOrderCategory(OrderCategoryVo orderCategoryVo) {
		OrderCategory OrderCategory = new OrderCategory();
		OrderCategory.setId(orderCategoryVo.getId());
		OrderCategory.setOrderCategory(orderCategoryVo.getOrderCategory());
		OrderCategory.setOrderDescription(orderCategoryVo.getOrderCategory());
		return orderCategoryVo;
	}
	@Override
	public OrderCategoryVo updateOrderCategory(OrderCategoryVo orderCategoryVo) {
		OrderCategory OrderCategory = new OrderCategory();
		OrderCategory.setId(orderCategoryVo.getId());
		OrderCategory.setOrderCategory(orderCategoryVo.getOrderCategory());
		OrderCategory.setOrderDescription(orderCategoryVo.getOrderDescription());
		return orderCategoryVo;
	}
	@Override
	public OrderCategory findbyOrderCategoryId(Integer orderCategoryId) {
		return orderCategoryRepo.findById(orderCategoryId).get();
	}



}
