package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AnswerRepo;
import com.example.demo.dao.QuestionRepo;
import com.example.demo.model.answers;
import com.example.demo.model.questions;

@RestController
public class AnswerController {
	

	@Autowired
	AnswerRepo ar;


	@GetMapping("/answers/qid/{qid}")
	public List<answers> getQuestionsByUId(@PathVariable("qid") int qid){
		
			return ar.findAllByqid(qid);
	}
	
	@PostMapping("/answer/post")
	public answers postQuestion(answers q) {
		ar.save(q);
		
		
		return q;
	}
}
