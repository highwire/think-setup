package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.DeliveryMethodOverridesService;
import com.mps.think.setup.vo.DeliveryMethodOverridesVO;

@RestController
public class DeliveryMethodOverridesController {
	
	@Autowired
	private DeliveryMethodOverridesService deliveryMethodOverridesService;
	
	@GetMapping("/getAllDeliveryMethodOverrides")
	public ResponseEntity<?> getAllDeliveryMethodOverrides() {
		return ResponseEntity.ok(deliveryMethodOverridesService.getAllDeliveryMethodOverrides());
	}
	
	@PostMapping("/saveDeliveryMethodOverrides")
	public ResponseEntity<?> saveDeliveryMethodOverrides(@RequestBody DeliveryMethodOverridesVO deliveryMethodOverride) {
		return ResponseEntity.ok(deliveryMethodOverridesService.saveDeliveryMethodOverrides(deliveryMethodOverride));
	}
	
	@PutMapping("/updateDeliveryMethodOverrides")
	public ResponseEntity<?> updateDeliveryMethodOverrides(@RequestBody DeliveryMethodOverridesVO deliveryMethodOverride) {
		return ResponseEntity.ok(deliveryMethodOverridesService.updateDeliveryMethodOverrides(deliveryMethodOverride));
	}
	
	@DeleteMapping("/deleteDeliveryMethodOverridesById")
	public ResponseEntity<?> deleteDeliveryMethodOverridesById(@RequestBody Integer id) {
		return ResponseEntity.ok(deliveryMethodOverridesService.deleteDeliveryMethodOverrideById(id));
	}
	
	@PostMapping("/getDeliveryMethodOverridesById")
	public ResponseEntity<?> getDeliveryMethodOverridesById(@RequestBody Integer id) {
		return ResponseEntity.ok(deliveryMethodOverridesService.getDeliveryMethodOverrideById(id));
	}
	
}
