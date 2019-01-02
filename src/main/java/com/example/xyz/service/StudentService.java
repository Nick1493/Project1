package com.example.xyz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.xyz.model.Student;
import com.example.xyz.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo SR;
	public String WelServ() {
		return "Welcome";
	}

	public Iterable<Student> getAll() {
		// TODO Auto-generated method stub
		return SR.findAll();
	}

	public String add
	
	
	(String name, String email) {
		// TODO Auto-generated method stub
		Student S=new Student();
		S.setName(name);
		S.setEmail(email);
		SR.save(S);
		return "done";
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		SR.deleteById(id);
		return "deleted";
	}
	
}
