package com.example.webdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${git.commit.id:no-git-for-you}")
	private String commitId;

	@RequestMapping("/")
	public String hello() {
		return "hello gitops at 3:55 PM!!!  commitId = [" + commitId + "]";
	}
}
