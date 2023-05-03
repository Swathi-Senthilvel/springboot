package com.snapchat.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Player
{
   @Id
   private int sno;
   private String name;
   private String lastname;
   private String age;
   private String stadium;
   private String team;
   private String opponentteam;
   private String matchno;
   private String hometeam;
   private String teamcaptain;
   private String opponentcaptain;
   private String place;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
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
public String getStadium() {
	return stadium;
}
public void setStadium(String stadium) {
	this.stadium = stadium;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getOpponentteam() {
	return opponentteam;
}
public void setOpponentteam(String opponentteam) {
	this.opponentteam = opponentteam;
}
public String getMatchno() {
	return matchno;
}
public void setMatchno(String matchno) {
	this.matchno = matchno;
}
public String getHometeam() {
	return hometeam;
}
public void setHometeam(String hometeam) {
	this.hometeam = hometeam;
}
public String getTeamcaptain() {
	return teamcaptain;
}
public void setTeamcaptain(String teamcaptain) {
	this.teamcaptain = teamcaptain;
}
public String getOpponentcaptain() {
	return opponentcaptain;
}
public void setOpponentcaptain(String opponentcaptain) {
	this.opponentcaptain = opponentcaptain;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}

  
}
