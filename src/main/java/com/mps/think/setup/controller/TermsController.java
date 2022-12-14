package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.mps.think.setup.service.TermsService;
import com.mps.think.setup.vo.CancelReasonsVO;
import com.mps.think.setup.vo.EnumModelVO.InstallmentTerm;
import com.mps.think.setup.vo.EnumModelVO.StartType;
import com.mps.think.setup.vo.TermsVO;


@RestController
@CrossOrigin
public class TermsController {
	
	@Autowired
	TermsService termsService;
	
	@GetMapping("/getAllTerms")
	public ResponseEntity<?> getAllTerms() {
		return ResponseEntity.ok(termsService.findAllTerms());
	}
	
	@PostMapping("/saveTerms")
	public ResponseEntity<?> saveterms(@RequestBody TermsVO Id) {
		return ResponseEntity.ok(termsService.saveTerms(Id));
	}
	
	@PostMapping("/updateTerms")
	public ResponseEntity<?> updateterms(@RequestBody TermsVO Id) {
		return ResponseEntity.ok(termsService.updateTerms(Id));
	}
	
	@PostMapping("/findbyTermsId")
	public ResponseEntity<?> findbyTermsId(@RequestBody Integer termsId) {
		return ResponseEntity.ok(termsService.findbytermsId(termsId));
	}
	
	@GetMapping("/findAllInstallmentTerm")
	public ResponseEntity<?> getAllInstallmentTerm() {
		return ResponseEntity.ok(InstallmentTerm.values());
	}
	
	@GetMapping("/findAllStartType")
	public ResponseEntity<?> getAllStartType() {
		return ResponseEntity.ok(StartType.values());
	}
	
	@DeleteMapping("/deleteByTermsId")
	public ResponseEntity<?> deleteBytermsId(@RequestBody Integer termsId) {
		return ResponseEntity.ok(termsService.deleteBytermsId(termsId));
	}

}
