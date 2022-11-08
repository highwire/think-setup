package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.CustomerCategoryService;
import com.mps.think.setup.vo.CustomerCategoryVO;
@RestController
public class CustomerCategoryController {
	
	@Autowired
	CustomerCategoryService customerCategoryService;
	
	@GetMapping("/getAllcustomerCategory")
	public ResponseEntity<?> getAllPubliser() {
		return ResponseEntity.ok(customerCategoryService.findAllCustomerCategory());
	}

	@PostMapping("/savecustomerCategory")
	public ResponseEntity<?> savecustomerCategory(@RequestBody CustomerCategoryVO creditStatus) {
		return ResponseEntity.ok(customerCategoryService.saveCustomerCategory(creditStatus));
	}
	
	@PostMapping("/updatecustomerCategory")
	public ResponseEntity<?> updatecustomerCategory(@RequestBody CustomerCategoryVO creditStatus) {
		return ResponseEntity.ok(customerCategoryService.updateCustomerCategory(creditStatus));
	}
	
	@PostMapping("/findbyCustomerCategoryId")
	public ResponseEntity<?> findbyCustomerCategoryId(@RequestBody Integer CustomerCategoryId) {
		return ResponseEntity.ok(customerCategoryService.findbyCustomerCategoryId(CustomerCategoryId));
	}

}
