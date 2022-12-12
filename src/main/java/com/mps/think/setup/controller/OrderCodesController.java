package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.OrderCodesService;
import com.mps.think.setup.vo.OrderClassVO;

@RestController
@CrossOrigin
public class OrderCodesController {
	
	@Autowired
	private OrderCodesService orderCodesService;
	
	@GetMapping("/orderCodes/{publisherId}")
	public ResponseEntity<?> getOrderClassByPublisherId(@PathVariable Integer publisherId) {
		return ResponseEntity.ok(orderCodesService.getOrderByPublisherId(publisherId));
	}
	
	@PostMapping("/orderCodes")
	public ResponseEntity<?> createOrderCodes(@RequestBody OrderClassVO orderCodes) {
		return ResponseEntity.ok(orderCodesService.createOrderCodes(orderCodes));
	}
	
	@PutMapping("/orderCodes")
	public ResponseEntity<?> updateOrderCodes(@RequestBody OrderClassVO orderCodes) {
		return ResponseEntity.ok(orderCodesService.updateOrderCodes(orderCodes));
	}
	
	@GetMapping("/getOrderCodes/{orderCodeId}")
	public ResponseEntity<?> getOrderCodesById(Integer orderCodeID) {
		return ResponseEntity.ok(orderCodesService.getOrderCodesById(orderCodeID));
	}

	@GetMapping("/getOrderItemDetails/{itemDetailsId}")
	public ResponseEntity<?> getOrderItemDetailsById(Integer itemDetailsId) {
		return ResponseEntity.ok(orderCodesService.getOrderItemDetailsById(itemDetailsId));
	}

	@GetMapping("/getOrderOptions/{orderOptionsId}")
	public ResponseEntity<?> getOrderOptionsById(Integer orderOptionsId) {
		return ResponseEntity.ok(orderCodesService.getOrderOptionsById(orderOptionsId));
	}

	@GetMapping("/getOrderPackageOptions/{orderPkgId}")
	public ResponseEntity<?> getOrderPackageOptionsById(Integer orderPkgId) {
		return ResponseEntity.ok(orderCodesService.getOrderPackageOptionsById(orderPkgId));
	}

	@GetMapping("/getOrderPaymentOptions/{orderPaymentId}")
	public ResponseEntity<?> getOrderPaymentOptionsById(Integer orderPaymentId) {
		return ResponseEntity.ok(orderCodesService.getOrderPaymentOptionsById(orderPaymentId));
	}

}
