package com.example.xyz.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.xyz.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
