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

import com.mps.think.setup.serviceImpl.SourceAttributeValueServiceImpl;
import com.mps.think.setup.vo.SourceAttributeValueVo;

@RestController
@CrossOrigin
public class SourceAttributeValueController {
	@Autowired
	SourceAttributeValueServiceImpl sourceAttributeValueServiceImpl;

	@RequestMapping(value = "/findAllSourceAttributeValue", method = RequestMethod.GET)
	public ResponseEntity<?> findAllSourceAttributeValue() {

		return ResponseEntity.ok(sourceAttributeValueServiceImpl.findAllSourceAttributeValue());
	}

	@RequestMapping(value = "/saveSourceAttributeValue", method = RequestMethod.POST)
	public ResponseEntity<?> saveSourceAttributeValue(
			@Valid @RequestBody SourceAttributeValueVo sourceAttributeValueVo) {

		return ResponseEntity.ok(sourceAttributeValueServiceImpl.saveSourceAttributeValue(sourceAttributeValueVo));
	}

	@PostMapping("/updateSourceAttributeValue")
	public ResponseEntity<?> updateSourceAttributeValue(@RequestBody SourceAttributeValueVo sourceAttributeValueVo) {
		return ResponseEntity.ok(sourceAttributeValueServiceImpl.updateSourceAttributeValue(sourceAttributeValueVo));
	}

	@RequestMapping(value = "/findbySourceAttributeValueId", method = RequestMethod.POST)
	public ResponseEntity<?> findbySourceAttributeValueId(@Valid @RequestBody Integer sourceAttributeValueId) {

		return ResponseEntity.ok(sourceAttributeValueServiceImpl.findbySourceAttributeValueId(sourceAttributeValueId));
	}
}
