package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.OrderClassRepo;
import com.mps.think.setup.service.OrderClassService;
import com.mps.think.setup.vo.OrderClassVO;
@Service
public class OrderClassServiceImpl implements OrderClassService{
	
	@Autowired
	OrderClassRepo orderClassRepo;

	@Override
	public List<OrderClass> findAllOrderClass() {
		return orderClassRepo.findAll();
	}

	@Override
	public OrderClassVO saveOrderClass(OrderClassVO orderClassVO) {
		OrderClass data=new OrderClass();
		Publisher pub=new Publisher();
		pub.setId(orderClassVO.getPubId().getId());
		data.setPubId(pub);
		orderClassRepo.saveAndFlush(data);
		orderClassVO.setOcId(data.getOcId());
		return orderClassVO;
	}

	@Override
	public OrderClassVO updateOrderClass(OrderClassVO orderClassVO) {
		OrderClass data=new OrderClass();
		data.setOcId(orderClassVO.getOcId());
		Publisher pub=new Publisher();
		pub.setId(orderClassVO.getPubId().getId());
		data.setPubId(pub);
		orderClassRepo.saveAndFlush(data);
		return orderClassVO;
	}

	@Override
	public OrderClass findbyOrderClassId(Integer orderClassId) {
		return orderClassRepo.findById(orderClassId).get();
	}

}
