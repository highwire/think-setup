package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.SpecialTaxIdsService;
import com.mps.think.setup.vo.SpecialTaxIdsVO;

@RestController
@CrossOrigin
public class SpecialTaxIdsController {

	@Autowired
	SpecialTaxIdsService stis;	
	
	
	@GetMapping("/getAllSpecialTaxIds")
	public ResponseEntity<?> getAllPubliser(){
		return ResponseEntity.ok(stis.findAllSpecialTaxIds());
	}

	@PostMapping("/saveSpecialTaxIds")
	public ResponseEntity<?> saveubs(@RequestBody SpecialTaxIdsVO Id){
		return ResponseEntity.ok(stis.saveSpecialTaxIds(Id));
	}

	@PostMapping("/updateSpecialTaxIds")
	public ResponseEntity<?> updateSpecialTaxIds(@RequestBody SpecialTaxIdsVO id){
		return ResponseEntity.ok(stis.updateSpecialTaxIds(id));
	}
//
	@PostMapping("/findbySpecialTaxIdsId")
	public ResponseEntity<?> findbyId(@RequestBody Integer id){
		return ResponseEntity.ok(stis.findbySpecialTaxIdsId(id));
	}
	// Controller for delete

	// @DeleteMapping("/deleteOrderCategory{id}")
	// public ResponseEntity<String> deleteOrderCategory(@PathVariable("id")
	// Integer orderCategoryId){
	// orderCategoryService.deleteOrderCategory(orderCategoryId);
	// return new ResponseEntity<>("OrderCategory successfully deleted!",
	// HttpStatus.OK);
	// }
	//
}
	

