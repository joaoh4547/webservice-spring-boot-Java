package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

@Service 
public class CategoryService {
	@Autowired	
	private CategoryRepository userRepository;
	
	public List<Category> findAll() {
		
		return userRepository.findAll();
		
	}
	public Category findById(Long id) {
		Optional<Category> optional = userRepository.findById(id);
		return optional.get();
	}
}
