package com.mps.think.setup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.OrderCategoryServiceImpl;

import com.mps.think.setup.vo.OrderCategoryVo;



@RestController
@CrossOrigin
public class OrderCategoryController {
	
	@Autowired
	OrderCategoryServiceImpl orderCategoryServiceImpl;
	
	@RequestMapping(value = "/findAllOrderCategory", method = RequestMethod.GET)
	public ResponseEntity<?> findAllOrderCategory() {
		return ResponseEntity.ok(orderCategoryServiceImpl.findAllOrderCategory());
	}
	
	@RequestMapping(value = "/saveOrderCategory", method = RequestMethod.POST)
	public ResponseEntity<?> saveOrderCategory(@Valid @RequestBody OrderCategoryVo orderCategoryVO) {
	    return ResponseEntity.ok(orderCategoryServiceImpl.saveOrderCategory(orderCategoryVO));
}
	
	@PostMapping("/updateOrderCategory")
	public ResponseEntity<?> updateOrderCategory(@RequestBody OrderCategoryVo orderCategoryVo) {
		return ResponseEntity.ok(orderCategoryServiceImpl.updateOrderCategory(orderCategoryVo));
	}
	
	@RequestMapping(value = "/findbyOrderCategoryId", method = RequestMethod.POST)
	public ResponseEntity<?> findbyOrderCategoryId(@Valid @RequestBody Integer orderCategoryId) {
		return ResponseEntity.ok(orderCategoryServiceImpl.findbyOrderCategoryId(orderCategoryId));
	}

}
