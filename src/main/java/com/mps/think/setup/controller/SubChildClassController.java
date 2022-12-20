package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.SubChildClassService;
import com.mps.think.setup.vo.SubChildClassVO;

@RestController
@CrossOrigin
public class SubChildClassController {
	
	@Autowired
	SubChildClassService subChildClassService;

	@GetMapping("/getAllSubChildClass")
	public ResponseEntity<?> getAllSubChildClass() {
		return ResponseEntity.ok(subChildClassService.findAllSubChildClass());
	}

	@PostMapping("/saveSubChildClass")
	public ResponseEntity<?> saveSubChildClass(@RequestBody SubChildClassVO subChildClassVO) {
		return ResponseEntity.ok(subChildClassService.saveSubChildClass(subChildClassVO));
	}
	
	@PutMapping("/updateSubChildClass")
	public ResponseEntity<?> updateSubChildClass(@RequestBody SubChildClassVO subChildClassVO) {
		return ResponseEntity.ok(subChildClassService.updateSubChildClass(subChildClassVO));
	}
	
	@PostMapping("/findbySubChildClassId")
	public ResponseEntity<?> findbySubChildClassId(@RequestBody Integer subChildClassId) {
		return ResponseEntity.ok(subChildClassService.findbySubChildClassId(subChildClassId));
	}
}
