package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WordService;

@RestController
public class SentenceController {

	@Autowired
	private WordService wordService;

	@GetMapping("/sentence")
	public String getSentence() {
		return wordService.getSubject() + " " + wordService.getVerb() + " " + wordService.getArticle() + " "
				+ wordService.getAdjective() + " " + wordService.getNoun() + ".";
	}

}
