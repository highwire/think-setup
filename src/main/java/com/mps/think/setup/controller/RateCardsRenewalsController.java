package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.mps.think.setup.service.RateCardsRenewalsService;
import com.mps.think.setup.vo.RateCardsRenewalsVO;


@RestController
@CrossOrigin
public class RateCardsRenewalsController {
	
	@Autowired
	RateCardsRenewalsService rateCardsRenewalsService;
	
	@GetMapping("/getAllRateCardsRenewals")
	public ResponseEntity<?> getAllRateCardsRenewals() {
		return ResponseEntity.ok(rateCardsRenewalsService.getAllRateCardsRenewals());	}

	@PostMapping("/saveRateCardsRenewals")
	public ResponseEntity<?> saverateCardsRenewals(@RequestBody RateCardsRenewalsVO id) {
		return ResponseEntity.ok(rateCardsRenewalsService.saveRateCardsRenewals(id));
	}
	
	@PostMapping("/updateRateCardsRenewals")
	public ResponseEntity<?> updaterateCardsRenewals(@RequestBody RateCardsRenewalsVO id) {
		return ResponseEntity.ok(rateCardsRenewalsService.updateRateCardsRenewals(id));
	}
	
	@PostMapping("/findbyRateCardsRenewalsId")
	public ResponseEntity<?> findbyRateCardsRenewalsId(@RequestBody Integer id) {
		return ResponseEntity.ok(rateCardsRenewalsService.findbyRateCardsRenewalsId(id));
	}
	
	@DeleteMapping("/deleteByRateCardsRenewalsId")
	public ResponseEntity<?> deleteByCancelReasonsId(@RequestBody Integer id) {
		return ResponseEntity.ok(rateCardsRenewalsService.deleteByRateCardsRenewalsId(id));
	}
	
	@PostMapping("/findAllRateCardsRenewalsByRateCardsId")
	public ResponseEntity<?> findAllRateCardsByRateCardsRenewalsId(@RequestBody Integer id) {
		return ResponseEntity.ok(rateCardsRenewalsService.getAllRateCardsRenewalsByRcId(id));
	}

}
