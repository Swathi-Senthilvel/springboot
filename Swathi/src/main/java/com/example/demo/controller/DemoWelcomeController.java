package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoWelcomeController
{
    @GetMapping("/login")
	public String welcome()
	{
		return "Welcome";
	}
}
