package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("noun-service")
public interface NounService {

	@GetMapping("/")
	String getWord();
	
}
