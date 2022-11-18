package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Test;
import com.example.demo.model.users;

public interface UserRepo extends JpaRepository<users,Integer>{
	
	//public List<Test> findAllByrollnum(int rollnum);
	public users findByuid(int uid);
	
	@Query("select u from users u where u.email = ?1 and u.password = ?2")
	public Optional<users> isValidUser(String email,String pass);
}