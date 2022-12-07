package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.ShippingPriceListService;
import com.mps.think.setup.vo.ShippingPriceListVO;

@RestController
public class ShippingPriceListController {

	@Autowired
	private ShippingPriceListService shippingPriceListService;
	
	@PostMapping("/saveShippingPriceList")
	public ResponseEntity<?> saveShippingPriceList(@RequestBody ShippingPriceListVO shippingPriceList) {
		return ResponseEntity.ok(shippingPriceListService.saveShippingPriceList(shippingPriceList));
	}
	
	@GetMapping("/getAllShippingPriceLists")
	public ResponseEntity<?> getAllShippingPriceLists() {
		return ResponseEntity.ok(shippingPriceListService.findAllShippingPriceList());
	}
	
	@PostMapping("/getShippingPriceListById")
	public ResponseEntity<?> getShippingPriceListById(@RequestBody Integer id) {
		return ResponseEntity.ok(shippingPriceListService.findShippingPriceListById(id));
	}
	
	@PutMapping("/updateShippingPriceList")
	public ResponseEntity<?> updateShippingPriceList(@RequestBody ShippingPriceListVO shippingPriceList) {
		return ResponseEntity.ok(shippingPriceListService.updateShippingPriceList(shippingPriceList));
	}
	
	@DeleteMapping("/deleteShippingPriceListById")
	public ResponseEntity<?> deleteShippingPriceListById(@RequestBody Integer id) {
		return ResponseEntity.ok(shippingPriceListService.deleteShippingPriceListById(id));
	}
	
}
