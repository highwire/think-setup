package com.mps.think.setup.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.SourceAttributeServiceImpl;
import com.mps.think.setup.vo.SourceAttributeVo;

@RestController
@CrossOrigin
public class SourceAttributeController {
	@Autowired
	SourceAttributeServiceImpl sourceAttributeServiceImpl;

	@RequestMapping(value = "/findAllSourceAttribute", method = RequestMethod.GET)
	public ResponseEntity<?> findAllSourceAttribute() {

		return ResponseEntity.ok(sourceAttributeServiceImpl.findAllSourceAttribute());
	}

	@RequestMapping(value = "/saveSourceAttribute", method = RequestMethod.POST)
	public ResponseEntity<?> saveSourceAttribute(@Valid @RequestBody SourceAttributeVo sourceAttributeVo) {

		return ResponseEntity.ok(sourceAttributeServiceImpl.saveSourceAttribute(sourceAttributeVo));
	}

	@PostMapping("/updateSourceAttribute")
	public ResponseEntity<?> updateSourceAttribute(@RequestBody SourceAttributeVo sourceAttributeVo) {
		return ResponseEntity.ok(sourceAttributeServiceImpl.updateSourceAttribute(sourceAttributeVo));
	}

@RequestMapping(value = "/findbySourceAttributeId", method = RequestMethod.POST)
public ResponseEntity<?> findbySourceAttributeId(@Valid @RequestBody Integer sourceAttributeId) {

	return ResponseEntity.ok(sourceAttributeServiceImpl.findbySourceAttributeId(sourceAttributeId));
}
}
