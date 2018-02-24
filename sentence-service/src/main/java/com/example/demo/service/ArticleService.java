package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("article-service")
public interface ArticleService {

	@GetMapping("/")
	String getWord();
	
}
