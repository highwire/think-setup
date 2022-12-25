package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.service.AddOrderService;
import com.mps.think.setup.vo.OrderVO;

@Service
public class AddOrderServiceImpl implements AddOrderService {

	@Autowired
	private AddOrderRepo addOrderRepo;

	@Override
	public Order saveOrder(OrderVO order) throws Exception {
		ObjectMapper m = new ObjectMapper();
		return addOrderRepo.save(m.convertValue(order, Order.class));
	}

	@Override
	public List<Order> getAllOrders() throws Exception {
		return addOrderRepo.findAll();
	}

	@Override
	public Order getOrderById(Integer orderId) throws Exception {
		return addOrderRepo.findById(orderId).get();
	}

	@Override
	public List<Order> getAllOrderByCustomerId(Integer customerId) throws Exception {
		return addOrderRepo.findAllByCustomerId(customerId);
	}

}
