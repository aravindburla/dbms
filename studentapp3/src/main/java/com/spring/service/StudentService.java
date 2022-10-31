package com.spring.service;

import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Student;

public interface StudentService {
	public String addStudent(Student student);
	public Student searchStudent(String sid);
	public String updateStudent(Student student);
	public String deleteStudent(String sid);
}

