package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.mps.think.setup.service.PublisherSerivce;
import com.mps.think.setup.vo.PublisherVO;

public class PublisherController {
	
	@Autowired 
	PublisherSerivce publisherSerivce;
	
	@GetMapping("/getAllPubliser")
	public ResponseEntity<?> getAllPubliser() {
		return ResponseEntity.ok(publisherSerivce.findAllPublisher());
	}

	@PostMapping("/savePublisher")
	public ResponseEntity<?> savePublisher(@RequestBody PublisherVO publiser) {
		return ResponseEntity.ok(publisherSerivce.savePublisher(publiser));
	}
	
	@PostMapping("/updatePublisher")
	public ResponseEntity<?> updatePublisher(@RequestBody PublisherVO publiser) {
		return ResponseEntity.ok(publisherSerivce.updatePublisher(publiser));
	}
	
	@PostMapping("/findbyPublisherId")
	public ResponseEntity<?> findbyPublisherId(@RequestBody Integer id) {
		return ResponseEntity.ok(publisherSerivce.findbyPublisherId(id));
	}

}
