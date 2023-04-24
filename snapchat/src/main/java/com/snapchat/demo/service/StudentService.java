package com.snapchat.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.model.Student;
import com.snapchat.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studsRepository;
	public List<Student> getAllStudents(){
	List<Student> studsList = studsRepository.findAll();
	return studsList;
	}
	public Student saveStudent(Student s)
	{
		Student obj = studsRepository.save(s);
		return obj;
	}
}
