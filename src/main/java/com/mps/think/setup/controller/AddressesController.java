package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.AddressService;
import com.mps.think.setup.vo.AddressesVO;
import com.mps.think.setup.vo.EnumModelVO.AddressCategory;
import com.mps.think.setup.vo.EnumModelVO.AddressType;
import com.mps.think.setup.vo.EnumModelVO.Frequency;

@RestController
@CrossOrigin
public class AddressesController {
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/getAllAddresses")
	public ResponseEntity<?> getAllAddresses() {
		return ResponseEntity.ok(addressService.getAllAddress());
	}

	@PostMapping("/saveAddresses")
	public ResponseEntity<?> saveaddresses(@RequestBody AddressesVO addressId) {
		return ResponseEntity.ok(addressService.saveAddresses(addressId));
	}
	
	@PostMapping("/updateAddresses")
	public ResponseEntity<?> updateaddresses(@RequestBody AddressesVO addressId) {
		return ResponseEntity.ok(addressService.updateAddresses(addressId));
	}
	
	@PostMapping("/findbyAddressesId")
	public ResponseEntity<?> findbyAddressesId(@RequestBody Integer addressId) {
		return ResponseEntity.ok(addressService.findbyAddressesId(addressId));
	}
	
	@DeleteMapping("/deleteByAddressesId")
	public ResponseEntity<?> deleteByCancelReasonsId(@RequestBody Integer addressId) {
		return ResponseEntity.ok(addressService.deleteByAddressesId(addressId));
	}
	
	@GetMapping("/findAllAddressType")
	public ResponseEntity<?> getAllAddressType() {
		return ResponseEntity.ok(AddressType.values());
	}
	
	@GetMapping("/findAllAddressCategory")
	public ResponseEntity<?> getAllAddressCategory() {
		return ResponseEntity.ok(AddressCategory.values());
	}
	
	@GetMapping("/findAllFrequency")
	public ResponseEntity<?> getAllFrequency() {
		return ResponseEntity.ok(Frequency.values());
	}
//	=============================================================================
	
	@PostMapping("/findAllAddressesByCustomerId")
	public ResponseEntity<?> findAllAddressesByCustId(@RequestBody Integer id) {
		return ResponseEntity.ok(addressService.getAllAddressesByCustomerId(id));
	}

}
