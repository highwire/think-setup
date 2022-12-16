package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.SubscriptionDefService;
import com.mps.think.setup.vo.SubscriptionDefinationVO;

@RestController
@CrossOrigin
public class SubscriptionDefinationController {

	@Autowired
	private SubscriptionDefService subscriptionDefService;
	
	@PostMapping("/saveSubscriptionDefination")
	public ResponseEntity<?> saveSubscriptionDefination(@RequestBody SubscriptionDefinationVO subscriptionDefination) {
		return ResponseEntity.ok(subscriptionDefService.createSubscriptionDefination(subscriptionDefination));
	}
	
	@PutMapping("/updateSubscriptionDefination")
	public ResponseEntity<?> updateSubscriptionDefination(@RequestBody SubscriptionDefinationVO subscriptionDefination) {
		return ResponseEntity.ok(subscriptionDefService.updateSubscriptionDefination(subscriptionDefination));
	}
	
	@GetMapping("subscriptionDefinations/{publisherId}")
	public ResponseEntity<?> getSubscriptionDefinationByPublisherId(@PathVariable Integer publisherId) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionDefByPublisherId(publisherId));
	}
	
	@GetMapping("/getSubscriptionDefKeyInfo/{id}")
	public ResponseEntity<?> getSubscriptionDefKeyInfoById(@PathVariable Integer id) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionDefKeyInfoById(id));
	}
	
	@GetMapping("/getSubscriptionItemDetails/{id}")
	public ResponseEntity<?> getSubscriptionItemDetailsById(@PathVariable Integer id) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionItemDetailsById(id));
	}
	
	@GetMapping("/getAllOrderCodesUnderSubDef")
	public ResponseEntity<?> getAllSubscriptionDefRecords() {
		return ResponseEntity.ok(subscriptionDefService.getAllOrderCodesUnderSubDef());
	}
	
	@DeleteMapping("deleteSubscriptionDefination")
	public ResponseEntity<?> deleteSubscriptionDefination(@RequestBody Integer id) {
		return ResponseEntity.ok(subscriptionDefService.deleteSubscriptionDefinationById(id));
	}
	
}
