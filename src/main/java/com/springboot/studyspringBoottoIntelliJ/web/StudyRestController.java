package com.springboot.studyspringBoottoIntelliJ.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class StudyRestController {

	@GetMapping("/test")
	public ResponseEntity<?> getMethod() {
		return ResponseEntity.ok().body("Test");
	}
}
