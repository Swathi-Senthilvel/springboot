package com.cricket.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.demo.model.Match;
import com.cricket.demo.repository.MatchRepository;

@Service
public class MatchService 
{
    @Autowired
	MatchRepository matRepository;
    public List<Match> getAllMatchs()
    {
    	List<Match> matList = matRepository.findAll();
    	return matList;
    }
}
