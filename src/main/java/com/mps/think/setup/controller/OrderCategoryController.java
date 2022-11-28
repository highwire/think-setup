package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<?> getAllPubliser() {
		return ResponseEntity.ok(orderCategoryService.findAllOrderCategory());
	}

	@PostMapping("/saveorderCategory")
	public ResponseEntity<?> saveorderCategory(@RequestBody OrderCategoryVO Id) {
		return ResponseEntity.ok(orderCategoryService.saveOrderCategory(Id));
	}
	
	@PostMapping("/updateorderCategory")
	public ResponseEntity<?> updateorderCategory(@RequestBody OrderCategoryVO Id) {
		return ResponseEntity.ok(orderCategoryService.updateOrderCategory(Id));
	}
	
	@PostMapping("/findbyOrderCategoryId")
	public ResponseEntity<?> findbyOrderCategoryId(@RequestBody Integer orderCategoryId) {
		return ResponseEntity.ok(orderCategoryService.findbyOrderCategoryId(orderCategoryId));
	}
//	Controller for delete
	
//	 @DeleteMapping("/deleteOrderCategory{id}")
//	    public ResponseEntity<String> deleteOrderCategory(@PathVariable("id") Integer orderCategoryId){
//		 orderCategoryService.deleteOrderCategory(orderCategoryId);
//	        return new ResponseEntity<>("OrderCategory successfully deleted!", HttpStatus.OK);
//	    }
//	
	  
}
