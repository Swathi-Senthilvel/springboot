package com.snapchat.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.snapchat.demo.model.Player;
import com.snapchat.demo.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository playRepository;
	public List<Player> getAllPlayers(){
	List<Player> playList = playRepository.findAll();
	return playList;
	}
	public Player savePlayer(Player s)
	{
		Player obj = playRepository.save(s);
		
		return obj;
	}
	public Player updatePlayer(Player s)
	{
		Player obj = playRepository.save(s);
		
		return obj;
	}
	public void deletePlayer(int jerseyno)
	{
		playRepository.deleteById(jerseyno);
	}
	public List<Player> sortPlayers(String name) 
	{
	    return playRepository.findAll(Sort.by(name));
		
	}
}
