package com.snapchat.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.snapchat.demo.model.Player;
import com.snapchat.demo.service.PlayerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public  class PlayerController {
	@Autowired
	PlayerService playService;
	@Tag(name="getAllDetails",description="getAll")
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
@PutMapping(value="/updatePlayer/{jno}")
public Player updatePlayer(@RequestBody Player s,@PathVariable int jno)
{
	return playService.updatePlayer(s,jno);
}
@PutMapping(value="/updatePlayer")
public Player updatePlayer(@RequestBody Player s)
{
	return playService.updatePlayer(s);
}
@DeleteMapping(value="/deletePlayer/{jerseyno}")
public void deletePlayer(@PathVariable("jerseyno") int jerseyno)
{
     playService.deletePlayer(jerseyno);
}
//sorting
@GetMapping("/sortPlayer/{name}")
public List<Player> sortPlayers(@PathVariable String name)
{
	return playService.sortPlayers(name);
}

//paging
@GetMapping("/pagingPlayer/{offset}/{pageSize}")
public Page<Player> pagingPlayers(@PathVariable int offset,@PathVariable int pageSize)
{
	return playService.pagingPlayers(offset,pageSize);
}

//pagingandsorting
@GetMapping("/pagingAndSortingPlayer/{offset}/{pageSize}/{field}")

public List<Player> pagingAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
{
	return playService.pagingAndSorting(offset, pageSize, field);
}


//http://localhost:9080/fetchStudentsByNamePrefix?prefix=a
@GetMapping("/{prefix}")
public List<Player> fetchByPrefix(@RequestParam String prefix)
{
	return playService.fetchTeamByPrefix(prefix);
}
@GetMapping("/{suffix}")
public List<Player> fetchBySuffix(@RequestParam String suffix)
{
	return playService.fetchTeamBySuffix(suffix);
}
//query
//http://localhost:8080/fetchStudentsByDepartment/ECE/Minu
@GetMapping("/fetchByPlayer/{team}/{name}")
public List<Player> getPlayersByTeam(@PathVariable String team,@PathVariable String name)
{
	return playService.getPlayersByTeam(team,name);

}
@DeleteMapping("/deletePlayerByName/{name}")
public String deletePlayerByName(@PathVariable String name)
{
	int result=playService.deletePlayerByName(name);
	if(result>0)
		return "Player record deleted";
	else
		return "Problem occured while deleting";
}

@PutMapping("/updatePlayerByName/{team}/{name}")
public String updatePlayerByName(@PathVariable String team,@PathVariable String name)
{
	int result=playService.updatePlayerByName(team,name);
	if(result>0)
		return "Player record updated";
	else
		return "Problem occured while updating";
}

@GetMapping("/nquery/{team}") 
List<Player>fetchPlayerByTeam(@PathVariable String team)
{
	return playService.fetchPlayerByTeam(team);
}
}


