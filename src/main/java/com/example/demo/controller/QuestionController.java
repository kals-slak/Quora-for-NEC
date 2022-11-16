package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.model.questions;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionController {
	
	@Autowired
	QuestionRepo qr;

	@GetMapping("/question/category/{category}")
	public Optional<questions> getQuestionByCategory(@PathVariable("category") String category ){
		
		return qr.findAllBycategory(category) ;
	}
	
	@GetMapping("/question")
	public List<questions> getQuestions(){
		return qr.findAll();
	}
	
	@GetMapping("/question/uid/{uid}")
	public List<questions> getQuestionsByUId(@PathVariable("uid") int uid){
		
			return qr.findAllByuid(uid);
	}
	
	@PostMapping("/question/post")
	public questions postQuestion(questions q) {
		qr.save(q);
		
		
		return q;
	}
}
