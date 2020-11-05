package com.jms.course.jwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1.0")
public class JwtController {
	
	@GetMapping(path = "version")
	public ResponseEntity<Object> version() {
		
		return ResponseEntity.ok("Version 1.0");
	}

}
