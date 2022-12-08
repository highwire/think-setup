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

import com.mps.think.setup.service.RCEffortRangeService;
import com.mps.think.setup.vo.RCEffortRangeVO;

@RestController
@CrossOrigin
public class RCEffortRangeController {

	@Autowired
	RCEffortRangeService effortRangeService;
	
	@GetMapping("/getAllRCEffortRange")
	public ResponseEntity<?> findAllRCEffortRange() {
		return ResponseEntity.ok(effortRangeService.findAllRCEffortRange());
	}

	@PostMapping("/saveRCEffortRange")
	public ResponseEntity<?> saveRCEffortRange(@RequestBody RCEffortRangeVO effortRangeVO) {
		return ResponseEntity.ok(effortRangeService.saveRCEffortRange(effortRangeVO));
	}
	
	@PutMapping("/updateRCEffortRange")
	public ResponseEntity<?> updateRCEffortRange(@RequestBody RCEffortRangeVO careffortRangeVOdVO) {
		return ResponseEntity.ok(effortRangeService.updateRCEffortRange(careffortRangeVOdVO));
	}
	
	@PostMapping("/findbyRCEffortRangeId")
	public ResponseEntity<?> findbyRCEffortRangeId(@RequestBody Integer rcEffortRangeId) {
		return ResponseEntity.ok(effortRangeService.findbyRCEffortRangeId(rcEffortRangeId));
	}
	
	@DeleteMapping("/deleteRCEffortRange")
	public ResponseEntity<?> deleteRCEffortRange(@RequestBody Integer rcEffortRangeId) {
		return ResponseEntity.ok(effortRangeService.deleteRCEffortRange(rcEffortRangeId));
	}
}
