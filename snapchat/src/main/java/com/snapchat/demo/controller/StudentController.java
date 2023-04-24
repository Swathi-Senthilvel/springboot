package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapchat.demo.model.Student;
import com.snapchat.demo.service.StudentService;


@RestController
public  class StudentController {
	@Autowired
	StudentService studsService;
	@GetMapping("/snap")
	public List<Student> getAllStudents()
	{
		List<Student> studsList = studsService.getAllStudents();
		return studsList;
	}

//http://localhost:8080/saveStudent
@PostMapping(value="/saveStudent")
public Student saveStudent(@RequestBody Student s)
{
	return studsService.saveStudent(s);
}
}
