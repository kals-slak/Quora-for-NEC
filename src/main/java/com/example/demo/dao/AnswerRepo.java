package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.answers;

public interface AnswerRepo extends JpaRepository<answers,Integer>{
	public List<answers> findAllByqid(int qid);
}
