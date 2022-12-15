package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.RenewalCardService;
import com.mps.think.setup.vo.RenewalCardVO;

@RestController
@CrossOrigin
public class RenewalCardController {
	@Autowired
	RenewalCardService renewalCardService;
	
	@GetMapping("/getAllRenewalCard")
	public ResponseEntity<?> findAllRenewalCard() {
		return ResponseEntity.ok(renewalCardService.findAllRenewalCard());
	}

	@PostMapping("/saveRenewalCard")
	public ResponseEntity<?> saveRenewalCard(@RequestBody RenewalCardVO cardVO) {
		return ResponseEntity.ok(renewalCardService.saveRenewalCard(cardVO));
	}
	
	@PutMapping("/updateRenewalCard")
	public ResponseEntity<?> updateRenewalCard(@RequestBody RenewalCardVO cardVO) {
		return ResponseEntity.ok(renewalCardService.updateRenewalCard(cardVO));
	}
	
	@PostMapping("/findbyRenewalCardId")
	public ResponseEntity<?> findbyRenewalCardId(@RequestBody Integer renewalCardId) {
		return ResponseEntity.ok(renewalCardService.findbyRenewalCardId(renewalCardId));
	}
	
	@DeleteMapping("/deleteRenewalCard")
	public ResponseEntity<?> deleteRenewalCard(@RequestBody Integer renewalCardId) {
		return ResponseEntity.ok(renewalCardService.deleteRenewalCard(renewalCardId));
	}
}
