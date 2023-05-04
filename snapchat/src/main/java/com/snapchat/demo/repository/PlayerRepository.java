package com.snapchat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>
{
	//positional parameter -> ? order match
	@Query("select s from Player s where s.team=?1 and s.name=?2")
	public List<Player> getPlayersByTeam(String team,String name);
	
	 //named parameter -> just name
	 @Query("select s from Player s where s.team=:team")
	 public List<Player> getPlayersByTeam(String team);
		
	 //DML
//	 @Modifying
//	 @Query("delete from Player s where s.name=?1")
//	 public int deletePlayerByName (String name);
	
   List<Player>findByNameStartingWith(String prefix);
   List<Player>findByNameEndingWith(String suffix);
   List<Player>findByTeam(String team);
	
	@Modifying
	@Query("delete  from Player s where s.name=?1" )
	public int deletePlayerByName(String name);
	
	@Modifying
	@Query("update Player s set s.team=?1 where s.name=?2" )
	public int updatePlayerByName(String team,String name);

	@Query(value="select * from players  where  team= ?1", nativeQuery=true)
	 	public List<Player> fetchPlayerByTeam(String  Team);
}
