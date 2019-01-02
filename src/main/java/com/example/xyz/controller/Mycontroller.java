package com.example.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.xyz.model.Student;
import com.example.xyz.repo.StudentRepo;
import com.example.xyz.service.StudentService;
@RestController
public class Mycontroller {
	
	
	@Autowired
	StudentService SS;
	
	@GetMapping(value="/home")
	public String m()
	  {
		return SS.WelServ();  
	  
	  }
	
	@GetMapping(path="/all")
	public  Iterable<Student> getAllUsers() {
		// This returns a JSON or XML with the users
		return SS.getAll();
	}
	
	@PostMapping(value="/add")
	public String add (@RequestParam String name, @RequestParam String email) {
		return SS.add(name, email);
	}
	
	@DeleteMapping(value="/delete")
	public String delete (@RequestParam int id) {
		return SS.delete(id);
	}
 }
	