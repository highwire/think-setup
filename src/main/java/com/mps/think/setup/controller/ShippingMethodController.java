package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.model.ShippingMethod;
import com.mps.think.setup.service.ShippingMethodService;
import com.mps.think.setup.vo.ShippingMethodVO;

@RestController
public class ShippingMethodController {

	@Autowired
	private ShippingMethodService shippingMethodService;
	
	@GetMapping("/getAllShippingMethods")
	public ResponseEntity<?> getAllShippingMethods() {
		return ResponseEntity.ok(shippingMethodService.getAllShippingMethods());
	}
	
	@PostMapping("/saveShippingMethod")
	public ResponseEntity<?> saveShippingServiceMethod(@RequestBody ShippingMethodVO shippingMethod) {
		return ResponseEntity.ok(shippingMethodService.saveShippingMethod(shippingMethod));
	}
	
	@PutMapping("/updateShippingMethod")
	public ResponseEntity<?> updateShippingMethod(@RequestBody ShippingMethodVO shippingMethod) {
		return ResponseEntity.ok(shippingMethodService.updateShippingMehtod(shippingMethod));
	}
	
	@PostMapping("/findShippingMethodById")
	public ResponseEntity<?> findShippingMethodById(@RequestBody Integer id) {
		return ResponseEntity.ok(shippingMethodService.getShippingMehtodByid(id));
	}
	
//	@DeleteMapping("/deleteShippingMethod")
//	public ResponseEntity<?> deleteShippingMethod(@RequestBody ShippingMethod shippingMethod) {
//		return ResponseEntity.ok(shippingMethodService.deleteShippingMethod(shippingMethod));
//	}
	
	@DeleteMapping("/deleteShippingMethodById")
	public ResponseEntity<?> deleteShippingMethodById(@RequestBody Integer id) {
		return ResponseEntity.ok(shippingMethodService.deleteShippingMethodById(id));
	}
	
}
