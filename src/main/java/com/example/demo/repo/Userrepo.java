package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.User;

public interface Userrepo extends JpaRepository <User,Integer>{

}
