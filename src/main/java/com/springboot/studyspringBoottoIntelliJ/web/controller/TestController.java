package com.springboot.studyspringBoottoIntelliJ.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test")
	public String testMapping() {
		
		return "method/get";
	}
	
	@GetMapping({"/", "/index"})
	public String testMapping2() {
		
		return "method/get";
	}
	
}
