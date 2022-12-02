package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.model.SubscriptionCategories;
import com.mps.think.setup.service.SubscriptionCategoriesService;
import com.mps.think.setup.vo.SubscriptionCategoriesVO;

@RestController
@CrossOrigin
public class SubscriptionCategoriesController {
	@Autowired
	SubscriptionCategoriesService  subscriptionCategoriesService ;
	
	@GetMapping("/getAllsubscriptionCategories")
	public ResponseEntity<?> getAllSubscriptionCategories() throws Exception {
		return ResponseEntity.ok(subscriptionCategoriesService.findAllSubscriptionCategories());
	}

	@PostMapping("/savesubscriptionCategories")
	public ResponseEntity<?> saveSubscriptionCategory(@RequestBody SubscriptionCategoriesVO subscriptionCategory) throws Exception {
		return ResponseEntity.ok(subscriptionCategoriesService.saveSubscriptionCategories(subscriptionCategory));
	}
	
	@PostMapping("/updatesubscriptionCategory")
	public ResponseEntity<?> updatecustomerCategory(@RequestBody SubscriptionCategoriesVO subscriptionCategory) throws Exception {
		return ResponseEntity.ok(subscriptionCategoriesService.updateSubscriptionCategories(subscriptionCategory));
	}
	
	@PostMapping("/findbysubscriptionCategoryId")
	public ResponseEntity<?> findbysubscriptionCategoryId(@RequestBody Integer subscriptionCategoryId) throws Exception {
		return ResponseEntity.ok(subscriptionCategoriesService.findbySubscriptionCategoriesId(subscriptionCategoryId));
	}

	
}
