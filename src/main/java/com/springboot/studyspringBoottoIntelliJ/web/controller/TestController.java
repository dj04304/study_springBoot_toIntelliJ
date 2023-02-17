package com.springboot.studyspringBoottoIntelliJ.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@GetMapping("/test")
	public String testMapping(Model model) {
		model.addAttribute("name", "홍길동");
		return "method/get";
	}
	
	@GetMapping({"/", "/index"})
	public String testMapping2() {
		
		return "method/get";
	}
	
	@GetMapping("/board")
	public String board() {
		return "board/index";
	}
	
}
