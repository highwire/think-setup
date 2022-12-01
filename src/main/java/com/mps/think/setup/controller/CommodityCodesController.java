package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.CommodityCodesService;
import com.mps.think.setup.vo.CommodityCodesVO;

@RestController
@CrossOrigin
public class CommodityCodesController {
	
	@Autowired
	CommodityCodesService commodityCodesService;
	
	@GetMapping("/getAllCommodityCodes")
	public ResponseEntity<?> getAllCommodityCodes() {
		return ResponseEntity.ok(commodityCodesService.findAllCommodityCodes());
	}
	
	@PostMapping("/saveCommodityCodes")
	public ResponseEntity<?> savecommodityCodes(@RequestBody CommodityCodesVO Id) {
		return ResponseEntity.ok(commodityCodesService.saveCommodityCodes(Id));
	}
	
	@PostMapping("/updateCommodityCodes")
	public ResponseEntity<?> updatecommodityCodes(@RequestBody CommodityCodesVO Id) {
		return ResponseEntity.ok(commodityCodesService.updateCommodityCodes(Id));
	}
	
	@PostMapping("/findbyCommodityCodesId")
	public ResponseEntity<?> findbyId(@RequestBody Integer Id) {
		return ResponseEntity.ok(commodityCodesService.findbyId(Id));
	}

}
