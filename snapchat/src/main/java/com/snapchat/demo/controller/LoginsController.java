package com.snapchat.demo.controller;



import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping; 
//import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
 
import com.snapchat.demo.model.SignUps; 
import com.snapchat.demo.service.SignUpsService; 
 
@RestController 
@CrossOrigin 
@RequestMapping("/login") 
public class LoginsController { 
        @Autowired  
        SignUpsService ser; 
        @GetMapping("/get") 
        private Iterable<SignUps> GetUsers(){ 
                return ser.GetAll(); 
        } 
//        @GetMapping("/get") 
//        private Iterable<SignUp> GetUsers(@PathVariable String username){ 
//                return ser.GetUserPassService(username); 
//        } 
}

