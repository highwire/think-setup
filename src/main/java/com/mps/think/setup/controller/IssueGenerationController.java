package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.serviceImpl.IssueGenerationServiceImpl;
import com.mps.think.setup.vo.IssueGenerationVo;

@RestController
@CrossOrigin
public class IssueGenerationController {

	@Autowired
	IssueGenerationServiceImpl issueGenerationServiceImpl;

	@GetMapping("/findAllIssueGeneration")
	public ResponseEntity<?> findAllIssueGeneration() {
		return ResponseEntity.ok(issueGenerationServiceImpl.findAllIssueGenerationVo());
	}

	@PostMapping("/saveIssueGeneration")
	public ResponseEntity<?> saveIssueGenerationVo(@RequestBody IssueGenerationVo issueGenerationVo) {
		return ResponseEntity.ok(issueGenerationServiceImpl.saveIssueGenerationVo(issueGenerationVo));
	}

	@PostMapping("/updateIssueGeneration")
	public ResponseEntity<?> updateIssueGeneration(@RequestBody IssueGenerationVo issueGenerationVo) {
		return ResponseEntity.ok(issueGenerationServiceImpl.updateIssueGenerationVo(issueGenerationVo));
	}

	@PostMapping("/findbyIssueId")
	public ResponseEntity<?> findbyIssueId(@RequestBody Integer issueId) {
		return ResponseEntity.ok(issueGenerationServiceImpl.findbyIssueId(issueId));
	}

}
