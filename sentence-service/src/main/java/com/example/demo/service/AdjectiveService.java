package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("adjective-service")
public interface AdjectiveService {

	@GetMapping("/")
	String getWord();
	
}
