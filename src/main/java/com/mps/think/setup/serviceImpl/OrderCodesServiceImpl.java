package com.mps.think.setup.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.OrderCodes;
import com.mps.think.setup.model.OrderItemDetails;
import com.mps.think.setup.model.OrderOptions;
import com.mps.think.setup.model.OrderPackageOptions;
import com.mps.think.setup.model.OrderPaymentOptions;
import com.mps.think.setup.repo.OrderCodesRepository;
import com.mps.think.setup.repo.OrderItemDetailsRepository;
import com.mps.think.setup.repo.OrderOptionsRepository;
import com.mps.think.setup.repo.OrderPackageOptionsRepository;
import com.mps.think.setup.repo.OrderPaymentOptionsRepository;
import com.mps.think.setup.service.OrderCodesService;
import com.mps.think.setup.vo.OrderCodesSuperVO;
import com.mps.think.setup.vo.OrderCodesVO;
import com.mps.think.setup.vo.OrderItemDetailsVO;
import com.mps.think.setup.vo.OrderOptionsVO;
import com.mps.think.setup.vo.OrderPackageOptionsVO;
import com.mps.think.setup.vo.OrderPaymentOptionsVO;

@Service
public class OrderCodesServiceImpl implements OrderCodesService {

	@Autowired
	private OrderCodesRepository orderCodesRepository;
	
	@Autowired
	private OrderItemDetailsRepository orderItemDetailsRepository;
	
	@Autowired
	private OrderOptionsRepository orderOptionsRepository;
	
	@Autowired
	private OrderPackageOptionsRepository orderPackageOptionsRepository;
	
	@Autowired
	private OrderPaymentOptionsRepository orderPaymentOptionsRepository;
	
	@Override
	public OrderCodesSuperVO createOrderCodes(OrderCodesSuperVO orderCodes) {
		ObjectMapper m = new ObjectMapper();
		orderCodesRepository.saveAndFlush(m.convertValue(orderCodes.getOrderCodes(), OrderCodes.class));
		orderItemDetailsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderItemDetails(), OrderItemDetails.class));
		orderOptionsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderOptions(), OrderOptions.class));
		orderPackageOptionsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderPackageOptions(), OrderPackageOptions.class));
		orderPaymentOptionsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderPaymentOptions(), OrderPaymentOptions.class));
		return orderCodes;
	}

	@Override
	public OrderCodesSuperVO updateOrderCodes(OrderCodesSuperVO orderCodes) {
		ObjectMapper m = new ObjectMapper();
		orderCodesRepository.saveAndFlush(m.convertValue(orderCodes.getOrderCodes(), OrderCodes.class));
		orderItemDetailsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderItemDetails(), OrderItemDetails.class));
		orderOptionsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderOptions(), OrderOptions.class));
		orderPackageOptionsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderPackageOptions(), OrderPackageOptions.class));
		orderPaymentOptionsRepository.saveAndFlush(m.convertValue(orderCodes.getOrderPaymentOptions(), OrderPaymentOptions.class));
		return orderCodes;
	}

	@Override
	public Map<String, Object> getOrderByPublisherId(Integer publisherId) {
		Map<String, Object> orderClass = new HashMap<String, Object>();
		orderClass.put("orderCodes", orderCodesRepository.findByPublisherId(publisherId));
		orderClass.put("orderItemDetails", orderItemDetailsRepository.findByPublisherId(publisherId));
		orderClass.put("orderPaymentOptions", orderPaymentOptionsRepository.findByPublisherId(publisherId));
		orderClass.put("orderOptions", orderOptionsRepository.findByPublisherId(publisherId));
		orderClass.put("orderPackageOptions", orderPackageOptionsRepository.findByPublisherId(publisherId));
		return orderClass;
	}

	@Override
	public OrderCodes getOrderCodesById(Integer orderCodeID) {
		Optional<OrderCodes> orderCode = orderCodesRepository.findById(orderCodeID);
		return orderCode.isPresent() ? orderCode.get() : null;
	}

	@Override
	public OrderItemDetails getOrderItemDetailsById(Integer itemDetailsId) {
		Optional<OrderItemDetails> itemDetail = orderItemDetailsRepository.findById(itemDetailsId);
		return itemDetail.isPresent() ? itemDetail.get() : null;
	}

	@Override
	public OrderOptions getOrderOptionsById(Integer orderOptionsId) {
		Optional<OrderOptions> orderOption = orderOptionsRepository.findById(orderOptionsId);
		return orderOption.isPresent() ? orderOption.get() : null;
	}

	@Override
	public OrderPackageOptions getOrderPackageOptionsById(Integer orderPkgId) {
		Optional<OrderPackageOptions> packageOption = orderPackageOptionsRepository.findById(orderPkgId);
		return packageOption.isPresent() ? packageOption.get() : null;
	}

	@Override
	public OrderPaymentOptions getOrderPaymentOptionsById(Integer orderPaymentId) {
		Optional<OrderPaymentOptions> paymentOption = orderPaymentOptionsRepository.findById(orderPaymentId);
		return paymentOption.isPresent() ? paymentOption.get() : null;
	}

	@Override
	public List<OrderCodes> getAllOrderCodes() {
		return orderCodesRepository.findAll();
	}

	@Override
	public OrderCodesSuperVO deleteOrderCode(Integer id) {
		
		Optional<OrderCodes> orderCode = orderCodesRepository.findById(id);
		Optional<OrderItemDetails> orderItemDetail = orderItemDetailsRepository.findById(id);
		Optional<OrderOptions> orderOption = orderOptionsRepository.findById(id);
		Optional<OrderPackageOptions> orderPackageOption = orderPackageOptionsRepository.findById(id);
		Optional<OrderPaymentOptions> orderPaymentOption = orderPaymentOptionsRepository.findById(id);
		
		OrderCodesSuperVO deletedOrderCode = new OrderCodesSuperVO();
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		if (orderCode.isPresent()) {
			deletedOrderCode.setOrderCodes(mapper.convertValue(orderCode.get(), OrderCodesVO.class));
			orderCodesRepository.delete(orderCode.get());
		}
		if (orderItemDetail.isPresent()) {
			deletedOrderCode.setOrderItemDetails(mapper.convertValue(orderItemDetail.get(), OrderItemDetailsVO.class));
			orderItemDetailsRepository.delete(orderItemDetail.get());
		}
		if (orderOption.isPresent()) {
			deletedOrderCode.setOrderOptions(mapper.convertValue(orderOption.get(), OrderOptionsVO.class));
			orderOptionsRepository.delete(orderOption.get());
		}
		if (orderPackageOption.isPresent()) {
			deletedOrderCode.setOrderPackageOptions(mapper.convertValue(orderPackageOption.get(), OrderPackageOptionsVO.class));
			orderPackageOptionsRepository.delete(orderPackageOption.get());
		}
		if (orderPaymentOption.isPresent()) {
			deletedOrderCode.setOrderPaymentOptions(mapper.convertValue(orderPaymentOption.get(), OrderPaymentOptionsVO.class));
			orderPaymentOptionsRepository.delete(orderPaymentOption.get());
		}
		
		return deletedOrderCode;
		
	}

}
