package com.instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramController 
{
	 @GetMapping("/signin")
     public String signin()
     {
		 return "Signin is Successfull";
     }
	 
	 @GetMapping("/landing page/{username}")
     public String signin(@PathVariable("username") String username)
     {
		 return "Landing page is Successfull for" +username;
     }
}
