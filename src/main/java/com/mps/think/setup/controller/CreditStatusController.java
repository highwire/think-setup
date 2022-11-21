package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.CreditStatusService;
import com.mps.think.setup.vo.CreditStatusVO;

@RestController
@CrossOrigin
public class CreditStatusController {
	
	@Autowired
	CreditStatusService creditStatusService;
	
	@GetMapping("/getAllCreditStatus")
	public ResponseEntity<?> getAllCreditStatus() {
		return ResponseEntity.ok(creditStatusService.findAllcreditStatus());
	}

	@PostMapping("/saveCreditStatus")
	public ResponseEntity<?> saveCreditStatus(@RequestBody CreditStatusVO creditStatus) {
		return ResponseEntity.ok(creditStatusService.savecreditStatus(creditStatus));
	}
	
	@PostMapping("/updateCreditStatus")
	public ResponseEntity<?> updateCreditStatus(@RequestBody CreditStatusVO creditStatus) {
		return ResponseEntity.ok(creditStatusService.updatecreditStatus(creditStatus));
	}

//	@PostMapping("/findbyPubId")
//	public ResponseEntity<?> findbyPubId(@RequestBody Integer PubId) {
//		return ResponseEntity.ok(creditStatusService.findbyPubId(PubId));
//	}
	
	@PostMapping("/findbycreditId")
	public ResponseEntity<?> findbycreditId(@RequestBody Integer creditId) {
		return ResponseEntity.ok(creditStatusService.findbycreditId(creditId));
	}
	

}
