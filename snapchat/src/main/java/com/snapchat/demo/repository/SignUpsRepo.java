package com.snapchat.demo.repository;

 import org.springframework.data.jpa.repository.Query; 
 import org.springframework.data.repository.CrudRepository; 
 import org.springframework.stereotype.Repository; 
  
 import com.snapchat.demo.model.SignUps; 
 @Repository 
 public interface SignUpsRepo extends CrudRepository<SignUps,Integer>{ 
         @Query("select cre.password from SignUp cre where cre.username=?1") 
         Iterable<SignUps> findAllUsernamePassword( String username); 
 }