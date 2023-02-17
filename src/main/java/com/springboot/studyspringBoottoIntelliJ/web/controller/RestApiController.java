package com.springboot.studyspringBoottoIntelliJ.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyspringBoottoIntelliJ.web.dto.TestUser;

@RestController
@RequestMapping("/api/v1")
public class RestApiController {

	@PostMapping("/user")
	public String login() {
		
		return "test data(post)";
	}
	
	@PostMapping("/signin")
	public String signin() {
		
		return "signin data(post)";
	}
	
	@PostMapping("/testUser")
	public Object testUser() {
		
		return TestUser.builder().username("홍길동")
													.password("1234")
													.build();
	}
}
