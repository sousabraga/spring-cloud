package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "data")
public class WordController {

	private String words;
	
	@GetMapping("/")
	public String getWord() {
		String[] wordArray = words.split(",");
		int i = (int) Math.round(Math.random() * (wordArray.length - 1));
		
		return wordArray[i];
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}
	
}
