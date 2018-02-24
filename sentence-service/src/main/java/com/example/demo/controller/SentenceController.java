package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return getWord("subject-service") + " " + getWord("verb-service") + " " + getWord("article-service") + " "
				+ getWord("adjective-service") + " " + getWord("noun-service") + ".";
	}

	public String getWord(String service) {
		return restTemplate.getForObject("http://" + service, String.class);	
	}

}
