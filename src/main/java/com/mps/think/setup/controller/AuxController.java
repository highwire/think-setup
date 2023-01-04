package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.AuxServiceImpl;
import com.mps.think.setup.vo.AuxVariableVO;

@RestController
@CrossOrigin
public class AuxController {
	
	@Autowired
	AuxServiceImpl auxServiceImpl;
	
	@GetMapping("/getAllAuxVariable")
	public ResponseEntity<?> getAllAuxVariable() {
		return ResponseEntity.ok(auxServiceImpl.findAllAuxVariable());
	}

	@PostMapping("/saveAllAuxVariable")
	public ResponseEntity<?> saveAllAuxVariable(@RequestBody AuxVariableVO auxVariableVO) {
		return ResponseEntity.ok(auxServiceImpl.saveAuxVariable(auxVariableVO));
	}
	
	@PostMapping("/updateAuxVariable")
	public ResponseEntity<?> updateCreditStatus(@RequestBody  AuxVariableVO auxVariableVO) {
		return ResponseEntity.ok(auxServiceImpl.updateAuxVariable(auxVariableVO));
	}
	
	@PostMapping("/findbyAuxId")
	public ResponseEntity<?> findbyAuxId(@RequestBody Integer auxId) {
		return ResponseEntity.ok(auxServiceImpl.findbyAuxId(auxId));
	}
	
	@DeleteMapping("/deleteBycAuxId")
	public ResponseEntity<?> deleteBycreditId(@RequestBody Integer auxId) {
		return ResponseEntity.ok(auxServiceImpl.deleteByAuxVariableId(auxId));
	}

}
