package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.CustomerDetailsService;
import com.mps.think.setup.vo.CustomerDetailsVO;
import com.mps.think.setup.vo.EnumModelVO.ChargeTaxOn;
import com.mps.think.setup.vo.EnumModelVO.ConfigurationOptionsforOrders;
import com.mps.think.setup.vo.EnumModelVO.CustomerCategory;
import com.mps.think.setup.vo.EnumModelVO.PaymentOptions;

@RestController
@CrossOrigin
public class CustomerDetailsController {
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<?> getAllCustomerDetails() {
		return ResponseEntity.ok(customerDetailsService.getAllCustomerDetails());
	}

	@PostMapping("/saveCustomer")
	public ResponseEntity<?> savecustomerDetails(@RequestBody CustomerDetailsVO customerId) {
		return ResponseEntity.ok(customerDetailsService.saveCustomerDetails(customerId));
	}
	
	@PostMapping("/updateCustomer")
	public ResponseEntity<?> updatecustomerDetails(@RequestBody CustomerDetailsVO customerId) {
		return ResponseEntity.ok(customerDetailsService.updateCustomerDetails(customerId));
	}
	
	@PostMapping("/findbyCustomerId")
	public ResponseEntity<?> findbyCustomerDetailsId(@RequestBody Integer customerId) {
		return ResponseEntity.ok(customerDetailsService.findbyCustomerDetailsId(customerId));
	}

	
	@GetMapping("/getAllCustomerCategory")
	public ResponseEntity<?> getAllCustomerCategory() {
		return ResponseEntity.ok(CustomerCategory.values());
	}
	
	@GetMapping("/getAllConfigurationOptionsforOrders")
	public ResponseEntity<?> getAllConfigurationOptionsforOrders() {
		return ResponseEntity.ok(ConfigurationOptionsforOrders.values());
	}
	
	@GetMapping("/getAllPaymentOptions")
	public ResponseEntity<?> getAllPaymentOptions() {
		return ResponseEntity.ok(PaymentOptions.values());
	}
	
	@GetMapping("/getAllChargeTaxOn")
	public ResponseEntity<?> getAllChargeTaxOn() {
		return ResponseEntity.ok(ChargeTaxOn.values());
	}

}
