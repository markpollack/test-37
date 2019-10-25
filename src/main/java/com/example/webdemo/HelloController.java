package com.example.webdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "hello gitops v0.0.5 at 2:56 PM!!!";
	}
}
