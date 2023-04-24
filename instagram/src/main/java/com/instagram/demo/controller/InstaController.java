package com.instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstaController 
{
  @GetMapping("/getpost")
  public String getPost(@RequestParam String username,@RequestParam String password)
  {
	  if(username.equals("admin") && password.equals("12345"))
	  {
		  return ("Login Successfull");
	  }
	  else
	  {
	  return ("Login failed");
  }
}
}
