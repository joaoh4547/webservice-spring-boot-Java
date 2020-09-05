package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "maria", "maria@gmail.com", "173597-5287", "123456");
		return ResponseEntity.ok().body(u);
	}
}
