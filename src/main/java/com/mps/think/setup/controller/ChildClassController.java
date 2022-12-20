package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.ChildClassService;
import com.mps.think.setup.vo.ChildClassVO;

@RestController
@CrossOrigin
public class ChildClassController {

	@Autowired
	ChildClassService childClassService;
	
	@GetMapping("/getAllChildClass")
	public ResponseEntity<?> getAllChildClass() {
		return ResponseEntity.ok(childClassService.findAllChildClass());
	}

	@PostMapping("/saveChildClass")
	public ResponseEntity<?> saveChildClass(@RequestBody ChildClassVO childClassVO) {
		return ResponseEntity.ok(childClassService.saveChildClass(childClassVO));
	}
	
	@PutMapping("/updateChildClass")
	public ResponseEntity<?> updateChildClass(@RequestBody ChildClassVO childClassVO) {
		return ResponseEntity.ok(childClassService.updateChildClass(childClassVO));
	}
	
	@PostMapping("/findbyChildClassId")
	public ResponseEntity<?> findbyChildClassId(@RequestBody Integer childClassId) {
		return ResponseEntity.ok(childClassService.findbyChildClassId(childClassId));
	}
}
