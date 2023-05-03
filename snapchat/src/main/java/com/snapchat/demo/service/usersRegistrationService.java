package com.snapchat.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.model.Registrations;
import com.snapchat.demo.repository.usersRegistrationRepository;



@Service
public class usersRegistrationService 
{
    @Autowired
    usersRegistrationRepository usrRegistrationRepository;
	public Registrations saveRegistration(Registrations r) 
	{
		return usrRegistrationRepository.save(r);
	}
	public List<Registrations> getAllUsers() 
	{
		 List<Registrations> regList = usrRegistrationRepository.findAll();
	      return regList;
	}
}