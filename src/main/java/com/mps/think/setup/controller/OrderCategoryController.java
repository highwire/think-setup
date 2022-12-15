
package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.mps.think.setup.service.OrderCategoryService;

import com.mps.think.setup.vo.OrderCategoryVO;

@RestController
@CrossOrigin
public class OrderCategoryController {
	
	@Autowired
	OrderCategoryService orderCategoryService;
	
	@GetMapping("/getAllOrderCategory")
	public ResponseEntity<?> getAllOrderCategory() {
		return ResponseEntity.ok(orderCategoryService.findAllOrderCategory());
	}

	@PostMapping("/saveorderCategory")
	public ResponseEntity<?> saveorderCategory(@RequestBody OrderCategoryVO orderCategoryId) {
		return ResponseEntity.ok(orderCategoryService.saveOrderCategory(orderCategoryId));
	}
	
	@PostMapping("/updateorderCategory")
	public ResponseEntity<?> updateorderCategory(@RequestBody OrderCategoryVO orderCategoryId) {
		return ResponseEntity.ok(orderCategoryService.updateOrderCategory(orderCategoryId));
	}
	
	@PostMapping("/findbyOrderCategoryId")
	public ResponseEntity<?> findbyorderCategoryId(@RequestBody Integer orderCategoryId) {
		return ResponseEntity.ok(orderCategoryService.findbyOrderCategoryId(orderCategoryId));
	}
	
	@DeleteMapping("/deleteOrderCategoryById")
	public ResponseEntity<?> deleteByOrderCategoryId(@RequestBody Integer orderCategoryId) {
		return ResponseEntity.ok(orderCategoryService.deleteByOrderCategoryId(orderCategoryId));
	}

	  
}

