package com.cricket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.demo.model.Match;
import com.cricket.demo.service.MatchService;

@RestController
public class MatchController 
{
	@Autowired
    MatchService matService;
    @GetMapping("/ipl")
    public List<Match> getAllMatchs()
    {
    	List<Match> matList = matService.getAllMatchs();
    	return matList;
    }   
}
