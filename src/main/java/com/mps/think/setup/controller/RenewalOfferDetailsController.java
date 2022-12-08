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

import com.mps.think.setup.service.RenewalOfferDetailsService;
import com.mps.think.setup.vo.RenewalOfferDetailsVO;


@RestController
@CrossOrigin
public class RenewalOfferDetailsController {

	@Autowired
	RenewalOfferDetailsService renewalOfferDetailsService;
	
	@GetMapping("/getRenewalOfferDetails")
	public ResponseEntity<?> findAllRenewalOfferDetails(){
		return ResponseEntity.ok(renewalOfferDetailsService.findAllRenewalOfferDetails());
	}
	
	@PostMapping("/saveRenewalOfferDetails")
	public ResponseEntity<?> saveRenewalOfferDetails(@RequestBody RenewalOfferDetailsVO renewalOfferDetailsVO){
		return ResponseEntity.ok(renewalOfferDetailsService.saveRenewalOfferDetails(renewalOfferDetailsVO));
	}
	
	@PutMapping("/updateRenewalOfferDetails")
	public ResponseEntity<?> updateRenewalOfferDetails(@RequestBody RenewalOfferDetailsVO renewalOfferDetailsVO){
		return ResponseEntity.ok(renewalOfferDetailsService.updateRenewalOfferDetails(renewalOfferDetailsVO));
	}
	
	@DeleteMapping("/deleteRenewalOfferDetails")
	public ResponseEntity<?> deleteRenewalOfferDetails(@RequestBody Integer renewalOfferDetailsId){
		return ResponseEntity.ok(renewalOfferDetailsService.deleteRenewalOfferDetails(renewalOfferDetailsId));
	}
	
	@PostMapping("/findByRenewalOfferDetailsId")
	ResponseEntity<?> findByRenewalOfferDetailsId(@RequestBody Integer renewalOfferDetailsId){
		return ResponseEntity.ok(renewalOfferDetailsService.findbyRenewalOfferDetailsId(renewalOfferDetailsId));
	}
}
