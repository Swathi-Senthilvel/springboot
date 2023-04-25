package com.cricket.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.demo.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match,Integer>{

}
