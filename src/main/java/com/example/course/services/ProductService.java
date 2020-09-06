package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

@Service 
public class ProductService {
	@Autowired	
	private ProductRepository userRepository;
	
	public List<Product> findAll() {
		
		return userRepository.findAll();
		
	}
	public Product findById(Long id) {
		Optional<Product> optional = userRepository.findById(id);
		return optional.get();
	}
}
