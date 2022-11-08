package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mps.think.setup.service.PublisherSerivce;
import com.mps.think.setup.service.RentalStatusService;
import com.mps.think.setup.vo.PublisherVO;
import com.mps.think.setup.vo.RentalStatusVO;

public class RentalStatusController {
	
	@Autowired 
	RentalStatusService rentalStatusService;
	
	@GetMapping("/getAllRentalStatus")
	public ResponseEntity<?> getAllRentalStatus() {
		return ResponseEntity.ok(rentalStatusService.findAllRentalStatus());
	}

	@PostMapping("/saveRentalStatus")
	public ResponseEntity<?> saveRentalStatus(@RequestBody RentalStatusVO rentalStatusVO) {
		return ResponseEntity.ok(rentalStatusService.saveRentalStatus(rentalStatusVO));
	}
	
	@PostMapping("/updateRentalStatus")
	public ResponseEntity<?> updateRentalStatus(@RequestBody RentalStatusVO rentalStatusVO) {
		return ResponseEntity.ok(rentalStatusService.updateRentalStatus(rentalStatusVO));
	}
	
	@PostMapping("/findbyRentalStatusId")
	public ResponseEntity<?> findbyRentalStatusId(@RequestBody Integer rentalStatusId) {
		return ResponseEntity.ok(rentalStatusService.findbyRentalStatusId(rentalStatusId));
	}

}
