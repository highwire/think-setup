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

import com.mps.think.setup.service.DeliveryMethodsService;
import com.mps.think.setup.vo.DeliveryMethodsVO;


@RestController
@CrossOrigin
public class DeliveryMethodsController {
	
	@Autowired
	private DeliveryMethodsService deliveryMethodService;
	
	@PostMapping("/saveDeliveryMethod")
	public ResponseEntity<?> saveDeliveryMethod(@RequestBody DeliveryMethodsVO delivery) {
		return ResponseEntity.ok(deliveryMethodService.saveDeliveryMethod(delivery));
	}
	
	@GetMapping("/getAllDeliveryMethods")
	public ResponseEntity<?> getAllDeliveryMethods() {
		return ResponseEntity.ok(deliveryMethodService.getAllDeliveryMethods());
	}
	
	@PutMapping("/updateDeliveryMethod")
	public ResponseEntity<?> updateDeliveryMethod(@RequestBody DeliveryMethodsVO delivery) {
		return ResponseEntity.ok(deliveryMethodService.updateDeliveryMethod(delivery));
	}
	
	@GetMapping("/getDeliveryMethod/{id}")
	public ResponseEntity<?> findDeliveryMethodById(@PathVariable Integer id) {
		return ResponseEntity.ok(deliveryMethodService.getDeliveryMethodById(id));
	}
	
//	@DeleteMapping("/deleteDeliveryMethod")
//	public ResponseEntity<?> deleteDeliveryMethod(@RequestBody DeliveryMethodsVO delivery) {
//		return ResponseEntity.ok(deliveryMethodService.deleteDeliveryMethod(delivery));
//	}
	
	@DeleteMapping("/deleteDeliveryMethodById")
	public ResponseEntity<?> deleteDeliveryMethodById(@RequestBody Integer id) {
		return ResponseEntity.ok(deliveryMethodService.deleteDeliveryMethodById(id));
	}
	
}
