package com.snapchat.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import com.snapchat.demo.model.Player;
import com.snapchat.demo.repository.PlayerRepository;

//import jakarta.transaction.Transactional;

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
     public Player updatePlayer(Player s,int jno)
     {
    	 Optional <Player>optional = playRepository.findById(jno);
    	 Player obj = null;
    	 if(optional.isPresent())
    	 {
    		 obj=optional.get();
////    		 obj.setJerseyno(s.getJerseyno());
////    		 obj.setName(s.getName());
////    		 obj.setRollplay(s.getRollplay());
////    		 obj.setTeam(s.getTeam());
    		 playRepository.save(s);
    	 }
    	 return obj;
     }
	
	public void deletePlayer(int jerseyno)
	{
		playRepository.deleteById(jerseyno);
	}
	public List<Player> sortPlayers(String name) 
	{
	    // Ascending Order return playRepository.findAll(Sort.by(name));
		return playRepository.findAll(Sort.by(name));
		
	}
	public Page<Player> pagingPlayers(int offset, int pageSize) 
	{
		PageRequest paging = PageRequest.of(offset, pageSize);
		Page<Player> playData=playRepository.findAll(paging);
		//List<Player> playList=playData.getContent();
		return playData;
	}
	
	public List<Player>pagingAndSorting(int offset,int pageSize,String field)
	{
		PageRequest paging = PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Player> play = playRepository.findAll(paging);
		return play.getContent();
	}
//	public List<Player> fetchTeamByPrefix(String prefix)
//	{
//		return playRepository.findByNameStartingWith(prefix);
//	}
//	public List<Player> fetchTeamBySuffix(String suffix)
//	{
//		return playRepository.findByNameEndingWith(suffix);
//	}
//	
//	public List<Player> getPlayersByTeam(String team,String name)
//	{
//		return playRepository.getPlayersByTeam(team,name);
//	}
	
//@Transactional
//public int deletePlayerByName(String name)
//{
//	return playRepository.deletePlayerByName(name);
//}

//@Transactional
//public int updatePlayerByName(String team,String name)
//{
//	return playRepository.updatePlayerByName(team,name);
//}
	
public List<Player> fetchPlayerByTeam(String team)
{
	return playRepository.fetchPlayerByTeam(team);
}
}
