package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.User;

import com.example.demo.repo.Userrepo;

@Service
public class Userservice {
	
	
	@Autowired
	Userrepo repository;
	
	public List<User> getall(){
		return repository.findAll();
		
	}
	
	public User insert(User bean) {
		return repository.save(bean);
	}
	
	public User findid(int id) {
		return repository.findById(id).get();
	}

}
