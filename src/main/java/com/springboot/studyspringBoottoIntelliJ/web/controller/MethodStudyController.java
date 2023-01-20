package com.springboot.studyspringBoottoIntelliJ.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MethodStudyController {

		@GetMapping({"/", "index"})
		public String getMethod() {
			return "method/get";
		}
		
		@PostMapping("/test")
		public String postMethod() {
			return "methdo/post";
		}
		
}
