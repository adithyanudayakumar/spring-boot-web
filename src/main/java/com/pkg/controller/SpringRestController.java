package com.pkg.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rest")
public class SpringRestController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello Adi from rest controller";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

}