package com.kush.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kush.model.User;
import com.kush.repository.UserJpaRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserJpaRepository userJpaRepository;

	@GetMapping(value="/all")
	public List<User> findAll(){
		return userJpaRepository.findAll();
	}
	
	@GetMapping(value="/{name}")
	public User findByName(@PathVariable final String name){
		return userJpaRepository.findByName(name);
	}
	
	@PostMapping(value="/upload")
	public User upload(@RequestBody final User user){
		 userJpaRepository.save(user);
		 return userJpaRepository.findByName(user.getName());
	}
	
}
/*
POST : first time resource is being created,
PUT : To update all fields of an existing resource,
PATCH : To update only few fields of an existing resource.
*/
