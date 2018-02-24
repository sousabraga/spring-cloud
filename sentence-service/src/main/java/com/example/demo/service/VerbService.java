package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("verb-service")
public interface VerbService {

	@GetMapping("/")
	String getWord();
	
}
