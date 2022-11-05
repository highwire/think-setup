package com.mps.think.setup.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AuthenticationController {

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody String user) throws Exception {
		
		if (user == null) {
			return ResponseEntity.ok("{\r\n"
					+ "  \"status\": \"error\",\r\n"
					+ "  \"message\": \"Email already exist\"\r\n"
					+ "}");
		} else {
			return ResponseEntity.ok(user);
		}
	}

		
}
