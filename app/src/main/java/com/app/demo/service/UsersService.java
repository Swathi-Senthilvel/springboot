package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.model.Users;
import com.app.demo.repository.UsersRepository;

@Service
public class UsersService {
	

		@Autowired
		private UsersRepository urep;
		
		public String checkLogin(String username, String password) {
		    Users us = urep.findByusername(username);
		    if (us == null) {
		      return "User Not Found";
		    }
		    else{
		    	if(us.getPassword().equals(password)) {	    		
		    		return"Login Succesfull"; 
		    	}
		    	else {
		    		return "Login Failed";
		    	}
		    }
		}
		public Users addUser(Users player) {
			return urep.save(player);
		}
		public List<Users> getUser()
		{
			return urep.findAll();
		}
	}