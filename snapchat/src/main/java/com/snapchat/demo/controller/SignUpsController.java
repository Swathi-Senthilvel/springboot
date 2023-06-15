package com.snapchat.demo.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
 
import com.snapchat.demo.model.SignUps; 
import com.snapchat.demo.repository.SignUpsRepo; 
 
@RestController 
@CrossOrigin 
@RequestMapping("/signups") 
public class SignUpsController { 
        @Autowired SignUpsRepo repo; 
        @PostMapping("/posts") 
        private SignUps PostUser(@RequestBody SignUps s){ 
                return repo.save(s); 
        } 
}
