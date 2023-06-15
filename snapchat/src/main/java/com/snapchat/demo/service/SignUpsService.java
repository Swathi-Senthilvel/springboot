package com.snapchat.demo.service;
 import org.springframework.beans.factory.annotation.Autowired; 
 import org.springframework.stereotype.Service; 
 import com.snapchat.demo.model.SignUps; 
 import com.snapchat.demo.repository.SignUpsRepo; 
 @Service 
 public class SignUpsService { 
         @Autowired  
         SignUpsRepo repo; 
 //        public Iterable<SignUp> GetUserPassService(String username){ 
 //                return repo.findAllUsernamePassword(username); 
 //        } 
         public Iterable<SignUps> GetAll(){ 
                 return repo.findAll(); 
         } 
          
 }