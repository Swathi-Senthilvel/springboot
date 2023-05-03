package com.snapchat.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snapchat.demo.model.Spectator;
import com.snapchat.demo.repository.SpectatorRepository;
import java.util.List;


@Service
public class SpectatorService 
{
	@Autowired
   SpectatorRepository personRepo;
		public List<Spectator>fetchAllPersons()
		{
			return personRepo.findAll();
		}
		public Spectator savePerson(Spectator p)
		{
			return personRepo.save(p);
		}
}
