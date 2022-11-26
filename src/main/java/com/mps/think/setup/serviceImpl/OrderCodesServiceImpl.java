package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SubOrderClassMapping;
import com.mps.think.setup.repo.OrderCodesRepository;
import com.mps.think.setup.service.OrderCodesService;

@Service
public class OrderCodesServiceImpl implements OrderCodesService {

	@Autowired
	private OrderCodesRepository orderCodesRepository;
	
	@Override
	public SubOrderClassMapping createOrderCodes(SubOrderClassMapping orderCodes) {
		return orderCodesRepository.saveAndFlush(orderCodes);
	}

	@Override
	public SubOrderClassMapping updateOrderCodes(SubOrderClassMapping orderCodes) {
		return orderCodesRepository.saveAndFlush(orderCodes);
	}

	@Override
	public List<SubOrderClassMapping> getAllOrderCodes() {
		return orderCodesRepository.findAll();
	}

	@Override
	public SubOrderClassMapping getOrderByOrderClassId(Integer orderClassId) {
		return orderCodesRepository.findByOrderClassId(orderClassId);
	}

}
