package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.OrderClassService;
import com.mps.think.setup.vo.OrderClassVO;

@RestController
@CrossOrigin
public class OrderClassController {

	@Autowired
	OrderClassService orderClassService;
	
	@GetMapping("/getAllOrderClass")
	public ResponseEntity<?> getAllOrderClass() {
		return ResponseEntity.ok(orderClassService.findAllOrderClass());
	}

	@PostMapping("/saveOrderClass")
	public ResponseEntity<?> saveOrderClass(@RequestBody OrderClassVO orderClassVO) {
		return ResponseEntity.ok(orderClassService.saveOrderClass(orderClassVO));
	}
	
	@PutMapping("/updateOrderClass")
	public ResponseEntity<?> updateOrderClass(@RequestBody OrderClassVO orderClassVO) {
		return ResponseEntity.ok(orderClassService.updateOrderClass(orderClassVO));
	}
	
	@PostMapping("/findbyOrderClassId")
	public ResponseEntity<?> findbyOrderClassId(@RequestBody Integer orderClassId) {
		return ResponseEntity.ok(orderClassService.findbyOrderClassId(orderClassId));
	}
}
