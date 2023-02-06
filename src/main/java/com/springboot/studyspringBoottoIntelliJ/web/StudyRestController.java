package com.springboot.studyspringBoottoIntelliJ.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class StudyRestController {


	@PostMapping("/test/post")
	public ResponseEntity<?> postMethod() throws Exception {
		return ResponseEntity.ok().body("test");
	}
	
}
