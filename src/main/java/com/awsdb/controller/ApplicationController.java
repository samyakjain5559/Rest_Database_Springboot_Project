package com.awsdb.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/data")
public class ApplicationController {
	
	@RequestMapping(value = "/get")
	public String getdata() {
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response1 = template.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
		return response1.getBody();
	}
}
