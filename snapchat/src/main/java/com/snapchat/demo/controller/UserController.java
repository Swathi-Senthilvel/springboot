package com.snapchat.demo.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snapchat.demo.model.User;
import com.snapchat.demo.service.UserService;




@RestController
@RequestMapping("/player")
public class UserController {

	
		@Autowired
		private UserService userv;
		
		
		  @PostMapping("/login")
		  public String login(@RequestBody Map<String, String> loginData) {
		    String username = loginData.get("username");
		    String password = loginData.get("password");
		    String result = userv.checkLogin(username, password);
		    return result;
		  }
		  @PostMapping("/adduser")
		  	public User AddUser(@RequestBody User us) 
		  {
			  return userv.addUser(us);
		  }
		  @GetMapping
		  public List<User> listAll()
		  {
			  return userv.getUser();
		  }
}


