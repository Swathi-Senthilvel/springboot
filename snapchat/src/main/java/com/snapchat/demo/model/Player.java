package com.snapchat.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player
{
   @Id
   private int jerseyno;
   private String name;
   private String lastname;
   private String age;
   private String birthplace;
   private String team;
   private String nationalteam;
   private String rollplay;
   private String ranking;
   private String debutagainst;
   private String playertype;
   private String highestscore;
public int getJerseyno() {
	return jerseyno;
}
public void setJerseyno(int jerseyno) {
	this.jerseyno = jerseyno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getBirthplace() {
	return birthplace;
}
public void setBirthplace(String birthplace) {
	this.birthplace = birthplace;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getNationalteam() {
	return nationalteam;
}
public void setNationalteam(String nationalteam) {
	this.nationalteam = nationalteam;
}
public String getRollplay() {
	return rollplay;
}
public void setRollplay(String rollplay) {
	this.rollplay = rollplay;
}
public String getRanking() {
	return ranking;
}
public void setRanking(String ranking) {
	this.ranking = ranking;
}
public String getDebutagainst() {
	return debutagainst;
}
public void setDebutagainst(String debutagainst) {
	this.debutagainst = debutagainst;
}
public String getPlayertype() {
	return playertype;
}
public void setPlayertype(String playertype) {
	this.playertype = playertype;
}
public String getHighestscore() {
	return highestscore;
}
public void setHighestscore(String highestscore) {
	this.highestscore = highestscore;
}

  
}
