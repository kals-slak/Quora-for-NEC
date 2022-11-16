package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.Test;

@Controller
public class addUser {
	
	@Autowired
	UserRepo userrepo;
	
	@RequestMapping("/home")
	public String user() {
		return "login.jsp";
	}
	
//	@RequestMapping("/signup")
//	public String signUp(Test user ) {
//		System.out.println(user.getName()+"...");
//		userrepo.save(user);
//		return "login.jsp";
//	}
	
//	@RequestMapping("/get/tuser/{rollnum}")
//	@ResponseBody
//	public List<Test> getUsers(@PathVariable("rollnum") Integer rollnum){
//		return userrepo.findAllByrollnum(rollnum);
//	}
	
}
