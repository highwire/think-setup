package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.ParentClassService;
import com.mps.think.setup.vo.ParentClassVO;

@RestController
@CrossOrigin
public class ParentClassController {

	@Autowired
	ParentClassService parentClassService;
	
	@GetMapping("/getAllParentClass")
	public ResponseEntity<?> getAllParentClass() {
		return ResponseEntity.ok(parentClassService.findAllParentClass());
	}

	@PostMapping("/saveParentClass")
	public ResponseEntity<?> saveParentClass(@RequestBody ParentClassVO parentClassVO) {
		return ResponseEntity.ok(parentClassService.saveParentClass(parentClassVO));
	}
	
	@PutMapping("/updateParentClass")
	public ResponseEntity<?> updateParentClass(@RequestBody ParentClassVO parentClassVO) {
		return ResponseEntity.ok(parentClassService.updateParentClass(parentClassVO));
	}
	
	@PostMapping("/findbyCParentClassId")
	public ResponseEntity<?> findbyCParentClassId(@RequestBody Integer parentClassId) {
		return ResponseEntity.ok(parentClassService.findbyParentClassId(parentClassId));
	}
}
