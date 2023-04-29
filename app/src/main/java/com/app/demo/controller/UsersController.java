package com.app.demo.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.model.Users;
import com.app.demo.service.UsersService;




@RestController
@RequestMapping("/player")
public class UsersController {

	
		@Autowired
		private UsersService userv;
		
		
		  @PostMapping("/login")
		  public String login(@RequestBody Map<String, String> loginData) {
		    String username = loginData.get("username");
		    String password = loginData.get("password");
		    String result = userv.checkLogin(username, password);
		    return result;
		  }
		  @PostMapping("/adduser")
		  	public Users AddUser(@RequestBody Users player) 
		  {
			  return userv.addUser(player);
		  }
		  @GetMapping
		  public List<Users> listAll()
		  {
			  return userv.getUser();
		  }
}


