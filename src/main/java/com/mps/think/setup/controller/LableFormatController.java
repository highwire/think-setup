package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.LableFormatServiceImp;
import com.mps.think.setup.vo.LableFormatVO;

@RestController
@CrossOrigin
public class LableFormatController {

	@Autowired
	LableFormatServiceImp lableFormatServiceImp;

	@GetMapping("/findAllLableFormat")
	public ResponseEntity<?> findAllLableFormat() {
		return ResponseEntity.ok(lableFormatServiceImp.findAllLableFormat());
	}

	@PostMapping("/saveLableFormat")
	public ResponseEntity<?> saveLableFormat(@RequestBody LableFormatVO lableFormatVO) {
		return ResponseEntity.ok(lableFormatServiceImp.saveLableFormat(lableFormatVO));
	}

	@PostMapping("/updateLableFormat")
	public ResponseEntity<?> updateLableFormat(@RequestBody  LableFormatVO lableFormatVO) {
		return ResponseEntity.ok(lableFormatServiceImp.updateLableFormat(lableFormatVO));
	}

	@PostMapping("/findbyLableFormatId")
	public ResponseEntity<?> findbyLableFormatId(@RequestBody Integer lableFormatId) {
		return ResponseEntity.ok(lableFormatServiceImp.findbyLableFormat(lableFormatId));
	}
	
	@DeleteMapping("/deleteByLableFormatId")
	public ResponseEntity<?> deleteByLableFormatId(@RequestBody Integer lableFormatId) {
		return ResponseEntity.ok(lableFormatServiceImp.deleteByLableFormatId(lableFormatId));
	}

}
