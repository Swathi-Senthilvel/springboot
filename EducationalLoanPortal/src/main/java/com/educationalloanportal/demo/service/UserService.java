package com.educationalloanportal.demo.service;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.educationalloanportal.demo.model.LoanApplicationModel;
import com.educationalloanportal.demo.model.UserModel;
import com.educationalloanportal.demo.repository.LoanApplicationModelRepository;
import com.educationalloanportal.demo.repository.UserRepository;

@Service
public class UserService 
{
    @Autowired
    UserRepository uRep;
    @Autowired
    LoanApplicationModelRepository lamRep;
	public String validateUser(String email,String password) 
	{
		UserModel u = uRep.findByEmail(email);
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	public UserModel newUser(UserModel user) 
	{	
		return uRep.save(user);
	}
	public List<UserModel> getUserDetails() 
	{	
		return uRep.findAll();
	}
	 public LoanApplicationModel getLoan(int loanId)
     {
		 LoanApplicationModel l = lamRep.findById(loanId).get();
  	   return l;
     }
	public UserModel getProfile(int id) 
	{
		UserModel u = uRep.findById(id).get();
		return u;
	}
	 public  UserModel updateUserModel(UserModel s,int id)
     {
    	 Optional <UserModel>optional = uRep.findById(id);
    	 UserModel obj = null;
    	 if(optional.isPresent())
    	 {
    		 obj=optional.get();
     	
    		 uRep.save(s);
    	 }
    	 return obj;
     }
	 public void deleteUserModel(int id)
	 {
		 uRep.deleteById(id);
	 }
	
}