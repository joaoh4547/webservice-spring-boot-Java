package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service 
public class UserService {
	@Autowired	
	private UserRepository userRepository;
	
	public List<User> findAll() {
		
		return userRepository.findAll();
		
	}
	public User findById(Long id) {
		Optional<User> optional = userRepository.findById(id);
		return optional.get();
	}
}
