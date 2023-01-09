package com.mps.think.setup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.AuxServiceImpl;
import com.mps.think.setup.utils.AppConstants.AuxCategory;
import com.mps.think.setup.utils.AppConstants.GenerationMethod;
import com.mps.think.setup.utils.AppConstants.VariableType;
import com.mps.think.setup.utils.AppConstants.codeGen;
import com.mps.think.setup.vo.AuxVariableVO;
import com.mps.think.setup.vo.EnumModelVO.ConfigurationOptionsforOrders;

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
	
	@GetMapping("/getAllAuxCategory")
	public ResponseEntity<?> getAllAuxCategory() {
		List<String> list= new ArrayList<>();
		for(AuxCategory data:AuxCategory.values()) {
			list.add(data.displayName());
		}
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/getAllVariableType")
	public ResponseEntity<?> getAllVariableType() {
		List<String> list= new ArrayList<>();
		for(VariableType data:VariableType.values()) {
			list.add(data.displayName());
		}
		return ResponseEntity.ok(list);
	}
}
