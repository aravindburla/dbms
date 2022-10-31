package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StudentDao;
import com.spring.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		String status = studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		// TODO Auto-generated method stub
		Student student = studentDao.search(sid);
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		String status = studentDao.update(student);
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
		String status = studentDao.delete(sid);
		return status;
	}


}
