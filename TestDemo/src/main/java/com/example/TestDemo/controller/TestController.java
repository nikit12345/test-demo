package com.example.TestDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	@GetMapping("/get")
	public String hi() {
		return "hiii";
	}

}
