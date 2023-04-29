package com.app.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.demo.model.Vilvah;

@Repository
public interface VilvahRepository extends JpaRepository<Vilvah,Integer>
{
//	//positional paramater -> ? order match
//	@Query("select s from Player s where s.team=?1 and s.name=?2")
//	public List<Player> getPlayersByTeam(String team,String name);
//	
//	 //name paramater -> just name
//	 @Query("select s from Player s where s.team=:team")
//	 public List<Player> getPlayersByTeam(String team);
//		
//	 //DML
//	 @Modifying
//	 @Query("delete from Player s where s.name=?1")
//	 public int deletePlayerByName (String nmae);
//	
//   List<Player>findByNameStartingWith(String prefix);
//   List<Player>findByNameEndingWith(String suffix);
//   List<Player>findByTeam(String team);
}
