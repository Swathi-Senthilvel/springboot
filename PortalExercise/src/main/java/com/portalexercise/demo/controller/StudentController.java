package com.portalexercise.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.portalexercise.demo.model.Student;
import com.portalexercise.demo.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService stuService;
         @GetMapping("/student/{StudentCourse}")
         public List<Student> get(@PathVariable String StudentCourse)
         {
        	 return stuService.get(StudentCourse);
         }
         @GetMapping("/students/{StudentCourseId}")
         public List<Student> getId(@PathVariable int StudentCourseId)
         {
        	 return stuService.getId(StudentCourseId);
         }
}