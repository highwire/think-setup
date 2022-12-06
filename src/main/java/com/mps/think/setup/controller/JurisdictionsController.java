package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.JurisdictionsService;
import com.mps.think.setup.vo.JurisdictionsVO;

@RestController
@CrossOrigin
public class JurisdictionsController {
	
	@Autowired
	JurisdictionsService jurisdictionsService;
	
	@GetMapping("/getAlljurisdictions")
	public ResponseEntity<?> getAlljurisdictions() {
		return ResponseEntity.ok(jurisdictionsService.findAllJurisdictions());
	}
	
	@PostMapping("/savejurisdictions")
	public ResponseEntity<?> savecommodityCodes(@RequestBody JurisdictionsVO Id) {
		return ResponseEntity.ok(jurisdictionsService.saveJurisdictions(Id));
	}
	
	@PostMapping("/updatejurisdictions")
	public ResponseEntity<?> updatecommodityCodes(@RequestBody JurisdictionsVO Id) {
		return ResponseEntity.ok(jurisdictionsService.updateJurisdictions(Id));
	}
	
	@PostMapping("/findbyjurisdictionsId")
	public ResponseEntity<?> findbyId(@RequestBody Integer Id) {
		return ResponseEntity.ok(jurisdictionsService.findbyId(Id));
	}

}
