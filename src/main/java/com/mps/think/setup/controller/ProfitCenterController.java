package com.mps.think.setup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.ProfitCenterServiceImpl;
import com.mps.think.setup.vo.ProfitCenterVO;

@RestController
@CrossOrigin
public class ProfitCenterController {
	@Autowired
	ProfitCenterServiceImpl profitCenterServiceImpl;

	@RequestMapping(value = "/findAllprofitCenter", method = RequestMethod.GET)
	public ResponseEntity<?> findAllprofitCenter() {

		return ResponseEntity.ok(profitCenterServiceImpl.findAllcreditStatus());
	}

	@RequestMapping(value = "/saveProfitCenter", method = RequestMethod.POST)
	public ResponseEntity<?> saveProfitCenter(@Valid @RequestBody ProfitCenterVO profitCenterVO) {

		return ResponseEntity.ok(profitCenterServiceImpl.savecreditStatus(profitCenterVO));
	}

	@RequestMapping(value = "/updateProfitCenter", method = RequestMethod.POST)
	public ResponseEntity<?> updateProfitCenter(@Valid @RequestBody ProfitCenterVO profitCenterVO) {

		return ResponseEntity.ok(profitCenterServiceImpl.updatecreditStatus(profitCenterVO));
	}

	@RequestMapping(value = "/findbyProfitCenter", method = RequestMethod.POST)
	public ResponseEntity<?> findbyProfitCenter(@Valid @RequestBody Integer profitCenterID) {

		return ResponseEntity.ok(profitCenterServiceImpl.findbycreditId(profitCenterID));
	}
	
	@DeleteMapping("/deleteByProfitCenterId")
	public ResponseEntity<?> deleteByProfitCenterId(@RequestBody Integer profitCenterID) {
		return ResponseEntity.ok(profitCenterServiceImpl.deleteByproftIdId(profitCenterID));
	}
}
