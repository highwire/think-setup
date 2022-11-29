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

import com.mps.think.setup.serviceImpl.SourceFormatSegmentServiceImpl;
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
}
