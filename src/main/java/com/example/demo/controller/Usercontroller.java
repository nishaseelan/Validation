package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;
import com.example.demo.service.Userservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/User")
public class Usercontroller {
	
	@Autowired
	Userservice s;

	@GetMapping("/findAll")
	public List<User> getMethod() {
		List<User> l = s.getall();
		return l;
	}

	@PostMapping("/insert")
	public User Add(@RequestBody @Valid  User bean) {
		return s.insert(bean);

	}
	
//	@GetMapping("/getMsg")
//	public String getMsg() {
//		return "Hii";
//	}
	@GetMapping("/{id}")
	public User find(@PathVariable int id) {
	return	s.findid(id);
	//	return "get";
	}

}
