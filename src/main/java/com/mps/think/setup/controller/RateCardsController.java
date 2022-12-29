package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.RateCardsService;
import com.mps.think.setup.vo.RateCardsVO;

@RestController
@CrossOrigin
public class RateCardsController {
	
	@Autowired
	RateCardsService rateCardsService;
	
	@GetMapping("/getAllRateCards")
	public ResponseEntity<?> getAllRateCards() {
		return ResponseEntity.ok(rateCardsService.findAllRateCards());
	}

	@PostMapping("/saveRateCards")
	public ResponseEntity<?> saverateCards(@RequestBody RateCardsVO rcId) {
		return ResponseEntity.ok( rateCardsService.saveRateCards(rcId));
	}
	
	@PostMapping("/updateRateCards")
	public ResponseEntity<?> updaterateCards(@RequestBody RateCardsVO rcId) {
		return ResponseEntity.ok( rateCardsService.updateRateCards(rcId));
	}
	
	@PostMapping("/findbyRateCardsId")
	public ResponseEntity<?> findbyrcId(@RequestBody Integer rcId) {
		return ResponseEntity.ok( rateCardsService.findbyrcId(rcId));
	}
	
	@DeleteMapping("/deleteByRateCardId")
	public ResponseEntity<?> deleteByRateCardId(@RequestBody Integer rcId) {
		return ResponseEntity.ok(rateCardsService.deleteByrcId(rcId));
	}

}
