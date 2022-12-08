package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.TransportModeService;
import com.mps.think.setup.vo.TransportModeVO;

@RestController
public class TransportModeController {

	@Autowired
	private TransportModeService transportModeService;
	
	@PostMapping("/saveTransportMode")
	public ResponseEntity<?> saveTransportMode(@RequestBody TransportModeVO transportMode) {
		return ResponseEntity.ok(transportModeService.saveTransportMode(transportMode));
	}
	
	@PutMapping("/updateTransportMode")
	public ResponseEntity<?> updateTransportMode(@RequestBody TransportModeVO transportMode) {
		return ResponseEntity.ok(transportModeService.updateTransportMode(transportMode));
	}
	
	@GetMapping("/getAllTransportModes")
	public ResponseEntity<?> getAllTransportModes() {
		return ResponseEntity.ok(transportModeService.getAllTransportModes());
	}
	
	@PostMapping("/getTransportModeById")
	public ResponseEntity<?> getTransportModeById(@RequestBody Integer id) {
		return ResponseEntity.ok(transportModeService.getTransportModeById(id));
	}
	
	@DeleteMapping("/deleteTransportModeById")
	public ResponseEntity<?> deleteTransportModeById(@RequestBody Integer id) {
		return ResponseEntity.ok(transportModeService.deleteTransportModeById(id));
	}
	
}
