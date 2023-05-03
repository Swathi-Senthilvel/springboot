package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapchat.demo.model.Registrations;
import com.snapchat.demo.service.usersRegistrationService;

@RestController
public class usersRegistrationController
{
	@Autowired
    usersRegistrationService usrRegsitrationService;
    @PostMapping("/registereduser")
    public Registrations saveRegistration(@RequestBody Registrations r)
    {
  	  return usrRegsitrationService.saveRegistration(r);
    }
    @GetMapping("/fetchalldata")
    public List<Registrations> getAllUsers()
    {
    	List<Registrations> regList = usrRegsitrationService.getAllUsers();
    	return regList;
    }
}
