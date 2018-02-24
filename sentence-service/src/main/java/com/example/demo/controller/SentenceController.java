package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.AdjectiveService;
import com.example.demo.service.ArticleService;
import com.example.demo.service.NounService;
import com.example.demo.service.SubjectService;
import com.example.demo.service.VerbService;

@RestController
public class SentenceController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AdjectiveService adjectiveService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private NounService nounService;
	
	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private VerbService verbService;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return subjectService.getWord() + " " + verbService.getWord() + " " + articleService.getWord() + " "
				+ adjectiveService.getWord() + " " + nounService.getWord() + ".";
	}

	@SuppressWarnings("unused")
	private String getWord(String service) {
		return restTemplate.getForObject("http://" + service, String.class);	
	}

}
