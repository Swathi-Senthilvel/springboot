package com.snapchat.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student
{
   @Id
   private int regno;
   private String name;
   private String dept;
   private String emailid;
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
   
}
