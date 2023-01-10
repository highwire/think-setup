package com.mps.think.setup.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.SourceFormatSegmentServiceImpl;
import com.mps.think.setup.utils.AppConstants.GenerationFunction;
import com.mps.think.setup.utils.AppConstants.GenerationMethod;
import com.mps.think.setup.utils.AppConstants.codeGen;
import com.mps.think.setup.vo.SourceFormatSegmentVo;

@RestController
@CrossOrigin
public class SourceFormatSegmentController {
	@Autowired
	SourceFormatSegmentServiceImpl sourceFormatSegmentServiceImpl;

	@RequestMapping(value = "/findAllSourceFormatSegment", method = RequestMethod.GET)
	public ResponseEntity<?> findAllSourceFormatSegment() {
		

		return ResponseEntity.ok(sourceFormatSegmentServiceImpl.findAllSourceFormatSegment());
	}

	@RequestMapping(value = "/saveSourceFormatSegment", method = RequestMethod.POST)
		public ResponseEntity<?> saveSourceFormatSegment(@Valid @RequestBody SourceFormatSegmentVo sourceFormatSegmentVO) {

		return ResponseEntity.ok(sourceFormatSegmentServiceImpl.saveSourceFormatSegment(sourceFormatSegmentVO));
	}

	@PostMapping("/updateSourceFormatSegment")
	public ResponseEntity<?> updateSourceFormatSegment(@RequestBody SourceFormatSegmentVo sourceFormatSegmentVo) {
		return ResponseEntity.ok(sourceFormatSegmentServiceImpl.updateSourceFormatSegment(sourceFormatSegmentVo));
	}

	@RequestMapping(value = "/findbySourceFormatSegmentId", method = RequestMethod.POST)
	public ResponseEntity<?> findbySourceFormatSegmentId(@Valid @RequestBody Integer SourceFormatSegmentId) {

		return ResponseEntity.ok(sourceFormatSegmentServiceImpl.findbySourceFormatSegmentId(SourceFormatSegmentId));
	}
	
	@GetMapping("/getAllGenerationFunction")
	public ResponseEntity<?> getAllGenerationFunction() {
		List<String> list= new ArrayList<>();
		for(GenerationFunction data:GenerationFunction.values()) {
			list.add(data.displayName());
		}
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/getAllGenerationMethod")
	public ResponseEntity<?> getAllGenerationMethod() {
		List<String> list= new ArrayList<>();
		for(GenerationMethod data:GenerationMethod.values()) {
			list.add(data.displayName());
		}
		return ResponseEntity.ok(list);
	}
}
