package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.questions;

public interface QuestionRepo extends JpaRepository<questions,Integer>{
	
	//@Query("form questions where category=spring")
	public Optional<questions> findAllBycategory(String s);
	
	public List<questions> findAllByuid(int uid);
}

