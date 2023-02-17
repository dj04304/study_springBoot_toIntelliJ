package com.springboot.studyspringBoottoIntelliJ.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestUser {

	private String username;
	private String password;
	
}
