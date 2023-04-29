package com.snapchat.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.model.User;
import com.snapchat.demo.repository.UserRepository;

@Service
public class UserService
{
		@Autowired
		private UserRepository urep;
		
		public String checkLogin(String username, String password) {
		    User us = urep.findByusername(username);
		    if (us == null) {
		      return "User Not Found";
		    }
		    else{
		    	if(us.getPassword().equals(password)) {	    		
		    		return "Login Succesfull"; 
		    	}
		    	else {
		    		return "Login Failed";
		    	}
		    }
		}
		public User addUser(User player) {
			return urep.save(player);
		}
		public List<User> getUser()
		{
			return urep.findAll();
		}
}