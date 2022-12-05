package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.SubscriptionCategoriesService;
import com.mps.think.setup.vo.SubscriptionCategoriesVO;

@RestController
@CrossOrigin
public class SubscriptionCategoriesController {
	@Autowired
	SubscriptionCategoriesService subscriptionCategoriesService;

	@GetMapping("/getAllsubscriptionCategories")
	public ResponseEntity<?> getAllPubliser() {
		return ResponseEntity.ok(subscriptionCategoriesService.findAllSubscriptionCategories());
	}

	// @GetMapping("/getAllsubscriptionCategories")
	// public ResponseEntity<?> getAllSubscriptionCategories() {
	// return
	// ResponseEntity.ok(subscriptionCategoriesService.findAllSubscriptionCategories());
	// }

	@PostMapping("/savesubscriptionCategories")
	public ResponseEntity<?> saveSubscriptionCategory(@RequestBody SubscriptionCategoriesVO subscriptionCategoryId) {
		return ResponseEntity.ok(subscriptionCategoriesService.saveSubscriptionCategories(subscriptionCategoryId));
	}

	@PostMapping("/updatesubscriptionCategory")
	public ResponseEntity<?> updatecustomerCategory(@RequestBody SubscriptionCategoriesVO subscriptionCategoryId) {
		return ResponseEntity.ok(subscriptionCategoriesService.updateSubscriptionCategories(subscriptionCategoryId));
	}

	@PostMapping("/findbysubscriptionCategoryId")
	public ResponseEntity<?> findbysubscriptionCategoryId(@RequestBody Integer subscriptionCategoryId) {
		return ResponseEntity.ok(subscriptionCategoriesService.findbySubscriptionCategoriesId(subscriptionCategoryId));
	}

}
