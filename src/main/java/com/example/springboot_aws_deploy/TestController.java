package com.example.springboot_aws_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class TestController {
	
	@GetMapping("/test")
	public String awsDeploymentTest() {
		return "Hi Naresh in ECS Deploymemt is Completed";
	}

}
