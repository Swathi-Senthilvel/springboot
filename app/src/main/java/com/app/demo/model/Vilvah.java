package com.app.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vilvah
{
   @Id
   private int productno;
   private String name;
   private String type;
   private String suitableskin;
   private String concernfor;
   private String rate;
   private String offer;
   private String offerper;
   private String spf;
   private String expiryyr;
   private String manufacturearea;
   private String manufacturedate;
public int getProductno() {
	return productno;
}
public void setProductno(int productno) {
	this.productno = productno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getSuitableskin() {
	return suitableskin;
}
public void setSuitableskin(String suitableskin) {
	this.suitableskin = suitableskin;
}
public String getConcernfor() {
	return concernfor;
}
public void setConcernfor(String concernfor) {
	this.concernfor = concernfor;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getOffer() {
	return offer;
}
public void setOffer(String offer) {
	this.offer = offer;
}
public String getOfferper() {
	return offerper;
}
public void setOfferper(String offerper) {
	this.offerper = offerper;
}
public String getSpf() {
	return spf;
}
public void setSpf(String spf) {
	this.spf = spf;
}
public String getExpiryyr() {
	return expiryyr;
}
public void setExpiryyr(String expiryyr) {
	this.expiryyr = expiryyr;
}
public String getManufacturearea() {
	return manufacturearea;
}
public void setManufacturearea(String manufacturearea) {
	this.manufacturearea = manufacturearea;
}
public String getManufacturedate() {
	return manufacturedate;
}
public void setManufacturedate(String manufacturedate) {
	this.manufacturedate = manufacturedate;
}
}
   