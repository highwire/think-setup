package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.TaxServiceImpl;
import com.mps.think.setup.vo.TaxTypeVO;

@RestController
@CrossOrigin
public class TaxController {

	@Autowired
	TaxServiceImpl taxServiceImpl;

	@GetMapping("/getAllTaxType")
	public ResponseEntity<?> getAllTaxType() {
		return ResponseEntity.ok(taxServiceImpl.findAllTaxType());
	}

	@PostMapping("/saveTaxType")
	public ResponseEntity<?> saveTaxType(@RequestBody TaxTypeVO taxTypeVO) {
		return ResponseEntity.ok(taxServiceImpl.saveTaxType(taxTypeVO));
	}

	@PostMapping("/updateTaxType")
	public ResponseEntity<?> updateTaxType(@RequestBody TaxTypeVO taxTypeVO) {
		return ResponseEntity.ok(taxServiceImpl.updateTaxType(taxTypeVO));
	}

	@PostMapping("/findbyTaxType")
	public ResponseEntity<?> findbyTaxType(@RequestBody Integer taxId) {
		return ResponseEntity.ok(taxServiceImpl.findbyTaxType(taxId));
	}

}
