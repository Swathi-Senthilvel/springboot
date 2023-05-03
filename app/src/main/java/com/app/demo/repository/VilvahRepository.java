package com.app.demo.repository;



//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.demo.model.Vilvah;

@Repository
public interface VilvahRepository extends JpaRepository<Vilvah,Integer>
{
	//positional paramater -> ? order match
//	@Query("select s from Vilvah s where s.type=?1 and s.name=?2")
//	public List<Vilvah> getVilvahsByType(String type,String name);
//	
//	 //name paramater -> just name
//	 @Query("select s from Vilvah s where s.type=:type")
//	 public List<Vilvah> getVilvahsByType(String type);
//		
//	 //DML
//	 @Modifying
//	 @Query("delete from Vilvah s where s.name=?1")
//	 public int VilvahByName (String name);
//	
//   List<Vilvah>findByNameStartingWith(String prefix);
//   List<Vilvah>findByNameEndingWith(String suffix);
//   List<Vilvah>findByTeam(String type);
	
	@Modifying
	@Query("delete  from Vilvah s where s.name=?1" )
	public int VilvahByName(String name);
	
//	@Modifying
//	@Query("update Vilvah s set s.type=?1 where s.name=?2" )
//	public int updateVilvahByName(String type,String name);
//
//	@Query(value="select * from Vilvah  s where  s.type= ?1", nativeQuery=true)
//	 	public List<Vilvah> fetchVilvahByType(String  Type);
}
