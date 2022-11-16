package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.users;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	UserRepo ur;
	@GetMapping("/user/{uid}")
	public users getUser(@PathVariable("uid") int id){
		
		users u = ur.findByuid(id);
		u.setPassword("null");
		return  u; 
	} 
	@GetMapping("/user")
	public List<users> getAllUser(){
		
		return  ur.findAll(); 
	}
	
	@PostMapping("/user/signup")
	public users postUser( users u) {
		
//		u.setUid(100);
//		u.setFollowers(0);
//		u.setFollowing(0);
		System.out.println("im i n");
		ur.save(u);
		return u;
	}
	
	

}
