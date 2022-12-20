package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.UnitBasedSubscriptionService;
import com.mps.think.setup.vo.UnitBasedSubscriptionVO;


@RestController
@CrossOrigin
public class UnitBasedSubscriptionController {

	@Autowired
	UnitBasedSubscriptionService ubss;
	
	
	@GetMapping("/getAllubs")
	public ResponseEntity<?> getAllPubliser(){
		return ResponseEntity.ok(ubss.findAllUnitBasedSubscription());
	}

	@PostMapping("/saveubs")
	public ResponseEntity<?> saveubs(@RequestBody UnitBasedSubscriptionVO ubsId){
		return ResponseEntity.ok(ubss.saveUnitBasedSubscription(ubsId));
	}

	@PostMapping("/updateubs")
	public ResponseEntity<?> updateubs(@RequestBody UnitBasedSubscriptionVO ubsid){
		return ResponseEntity.ok(ubss.updateUnitBasedSubscription(ubsid));
	}

	@PostMapping("/findbyId")
	public ResponseEntity<?> findbyId(@RequestBody Integer ubsid){
		return ResponseEntity.ok(ubss.findbyUnitBasedSubscriptionId(ubsid));
	}
	
	@DeleteMapping("/deleteByubsId")
	public ResponseEntity<?> deleteByUbsId(@RequestBody Integer ubsid) {
		return ResponseEntity.ok(ubss.deleteByUnitBasedSubscriptionId(ubsid));
	}
	
}
	

