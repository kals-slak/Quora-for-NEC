package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Test;
import com.example.demo.model.users;

public interface UserRepo extends JpaRepository<users,Integer>{
	
	//public List<Test> findAllByrollnum(int rollnum);
	public users findByuid(int uid);
}