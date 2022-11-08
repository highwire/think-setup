package com.mps.think.setup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.SalesRepresentativeServiceImp;
import com.mps.think.setup.vo.SalesRepresentativeVO;

@RestController
@CrossOrigin
public class SalesRepresentativeController {
	@Autowired
	SalesRepresentativeServiceImp salesRepresentativeServiceImp;

	@RequestMapping(value = "/findAllSalesRepresentative", method = RequestMethod.GET)
	public ResponseEntity<?> findAllSalesRepresentative() {

		return ResponseEntity.ok(salesRepresentativeServiceImp.findAllSalesRepresentative());
	}

	@RequestMapping(value = "/saveSalesRepresentative", method = RequestMethod.POST)
	public ResponseEntity<?> saveSalesRepresentative(@Valid @RequestBody SalesRepresentativeVO salesRepresentativeVO) {

		return ResponseEntity.ok(salesRepresentativeServiceImp.saveSalesRepresentative(salesRepresentativeVO));
	}

}
