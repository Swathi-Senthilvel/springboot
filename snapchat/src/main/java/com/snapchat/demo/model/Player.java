package com.snapchat.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player
{
   @Id
   private int jerseyno;
   private String name;
   private String team;
   private String rollplay;
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
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getRollplay() {
	return rollplay;
}
public void setRollplay(String rollplay) {
	this.rollplay = rollplay;
}
 
}
