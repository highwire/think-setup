package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.LableKeyLineServiceImpl;
import com.mps.think.setup.vo.LableKeyLineVO;

@RestController
@CrossOrigin
public class KeyLineController {

	@Autowired
	LableKeyLineServiceImpl lableKeyLineServiceImpl;

	@GetMapping("/findAllLableKeyLine")
	public ResponseEntity<?> findAllLableKeyLine() {
		return ResponseEntity.ok(lableKeyLineServiceImpl.findAllLableKeyLine());
	}

	@PostMapping("/saveLableKeyLine")
	public ResponseEntity<?> saveLableKeyLine(@RequestBody LableKeyLineVO lableKeyLineVO) {
		return ResponseEntity.ok(lableKeyLineServiceImpl.saveLableKeyLine(lableKeyLineVO));
	}

	@PostMapping("/updateLableKeyLine")
	public ResponseEntity<?> updateLableKeyLine(@RequestBody LableKeyLineVO lableKeyLineVO) {
		return ResponseEntity.ok(lableKeyLineServiceImpl.updateLableKeyLine(lableKeyLineVO));
	}

	@PostMapping("/findbyLableKeyLineById")
	public ResponseEntity<?> findbyLableKeyLineById(@RequestBody Integer lableKeyLineId) {
		return ResponseEntity.ok(lableKeyLineServiceImpl.findbyLableKeyLine(lableKeyLineId));
	}
	
	@DeleteMapping("/deleteByLableKeyLineId")
	public ResponseEntity<?> deleteByLableKeyLineId(@RequestBody Integer lableKeylineId) {
		return ResponseEntity.ok(lableKeyLineServiceImpl.deleteByLableKeyLineId(lableKeylineId));
	}

}
