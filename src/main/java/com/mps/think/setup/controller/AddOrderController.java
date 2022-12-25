package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.AddOrderService;
import com.mps.think.setup.vo.OrderVO;

@RestController
@CrossOrigin
public class AddOrderController {
	
	@Autowired
	private AddOrderService addOrderService;
	
	@PostMapping("/saveOrder")
	public ResponseEntity<?> saveOrder(@RequestBody OrderVO order) throws Exception {
		return ResponseEntity.ok(addOrderService.saveOrder(order));
	}
	
	@GetMapping("/getAllOrders")
	public ResponseEntity<?> getAllOrders() throws Exception {
		return ResponseEntity.ok(addOrderService.getAllOrders());
	}
	
	@GetMapping("/getOrderById/{orderId}")
	public ResponseEntity<?> getOrderById(@PathVariable Integer orderId) throws Exception {
		return ResponseEntity.ok(addOrderService.getOrderById(orderId));
	}
	
	@GetMapping("/getAllOrderByCustomerId/{customerId}")
	public ResponseEntity<?> getAllOrderByCustomerId(@PathVariable Integer customerId) throws Exception {
		return ResponseEntity.ok(addOrderService.getAllOrderByCustomerId(customerId));
	}

}
