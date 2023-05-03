package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.snapchat.demo.model.Spectator;
import com.snapchat.demo.service.SpectatorService;

@RestController
public class SpectatorController
{
	@Autowired
     SpectatorService personserv;
	@GetMapping("/getAllpersons")
		public List<Spectator>fetchAllPersons()
		{
			return personserv.fetchAllPersons();
    	}
}
