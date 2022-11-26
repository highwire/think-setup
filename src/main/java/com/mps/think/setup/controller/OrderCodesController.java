package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.model.SubOrderClassMapping;
import com.mps.think.setup.service.OrderCodesService;
import com.mps.think.setup.vo.CustomerCategoryVO;

@RestController
@CrossOrigin
public class OrderCodesController {
	
	@Autowired
	private OrderCodesService orderCodesService;
	
	@GetMapping("/orderCodes")
	public ResponseEntity<?> getAllOrderCodes() {
		return ResponseEntity.ok(orderCodesService.getAllOrderCodes());
	}
	
	@GetMapping("/orderCodes/{orderCode}")
	public ResponseEntity<?> getOrderByOrderClassId(@PathVariable Integer orderCode) {
		return ResponseEntity.ok(orderCodesService.getOrderByOrderClassId(orderCode));
	}
	
	@PostMapping("/orderCodes")
	public ResponseEntity<?> createOrderCodes(@RequestBody SubOrderClassMapping orderCodes) {
		return ResponseEntity.ok(orderCodesService.createOrderCodes(orderCodes));
	}
	
	@PatchMapping("/orderCodes")
	public ResponseEntity<?> updateOrderCodes(@RequestBody SubOrderClassMapping orderCodes) {
		return ResponseEntity.ok(orderCodesService.updateOrderCodes(orderCodes));
	}

}
