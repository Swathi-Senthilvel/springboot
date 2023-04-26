package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapchat.demo.model.Player;
import com.snapchat.demo.service.PlayerService;

@RestController
public  class PlayerController {
	@Autowired
	PlayerService playService;
	@GetMapping("/out")
	public List<Player> getAllPlayers()
	{
		List<Player> playList = playService.getAllPlayers();
		return playList;
	}

//http://localhost:8080/saveStudent
@PostMapping(value="/savePlayer")
public Player savePlayer(@RequestBody Player s)
{
	return playService.savePlayer(s);
}
@PutMapping(value="/updatePlayer")
public Player updatePlayer(@RequestBody Player s)
{
	return playService.savePlayer(s);
}
@DeleteMapping(value="/deletePlayer/{jno}")
public void deletePlayer(@PathVariable("jno") int jerseyno)
{
     playService.deletePlayer(jerseyno);
}

@GetMapping("/sortPlayer/{name}")
public List<Player> sortPlayers(@PathVariable String name)
{
	return playService.sortPlayers(name);
}
}
