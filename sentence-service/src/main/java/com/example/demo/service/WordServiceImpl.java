package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServiceImpl implements WordService {

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

	@Override
	@HystrixCommand(fallbackMethod = "getFallbackAdjective")
	public String getAdjective() {
		return adjectiveService.getWord();
	}

	@Override
	public String getArticle() {
		return articleService.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getFallbackNoun")
	public String getNoun() {
		return nounService.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getFallbackSubject")
	public String getSubject() {
		return subjectService.getWord();
	}

	@Override
	public String getVerb() {
		return verbService.getWord();
	}
	
	public String getFallbackAdjective() {
		return "";
	}
	
	public String getFallbackNoun() {
		return "something";
	}
	
	public String getFallbackSubject() {
		return "Someone";
	}
	
}
