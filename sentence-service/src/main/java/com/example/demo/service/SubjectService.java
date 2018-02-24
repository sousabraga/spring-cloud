package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("subject-service")
public interface SubjectService {

	@GetMapping("/")
	String getWord();
	
}
