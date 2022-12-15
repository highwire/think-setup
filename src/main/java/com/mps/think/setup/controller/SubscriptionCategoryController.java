package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.SubscriptionCategoryService;
import com.mps.think.setup.vo.SubscriptionCategoryVO;

@RestController
@CrossOrigin
public class SubscriptionCategoryController {
	
	@Autowired
	SubscriptionCategoryService subscriptionCategoryService;
	
	@GetMapping("/getAllSubscriptionCategory")
	public ResponseEntity<?> getAllSubscriptionCategory() {
		return ResponseEntity.ok(subscriptionCategoryService.findAllSubscriptionCategory());
	}

	@PostMapping("/saveSubscriptionCategory")
	public ResponseEntity<?> savesubscriptionCategory(@RequestBody SubscriptionCategoryVO id) {
		return ResponseEntity.ok(subscriptionCategoryService.saveSubscriptionCategory(id));
	}
	
	@PostMapping("/updateSubscriptionCategory")
	public ResponseEntity<?> updatesubscriptionCategory(@RequestBody SubscriptionCategoryVO id) {
		return ResponseEntity.ok(subscriptionCategoryService.updateSubscriptionCategory(id));
	}
	
	@PostMapping("/findbyScId")
	public ResponseEntity<?> findbyId(@RequestBody Integer id) {
		return ResponseEntity.ok(subscriptionCategoryService.findbyId(id));
	}
	
	@DeleteMapping("/deleteByScId")
	public ResponseEntity<?> deleteSubscriptionCategoryById(@RequestBody Integer id) {
		return ResponseEntity.ok(subscriptionCategoryService.deleteSubscriptionCategoryById(id));
	}

}
