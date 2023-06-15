package com.app.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerssaddress")
	public class CustomerAddress 
	{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int customerid;
	    private String street;
	    private String city;
	    private String zipCode;
		public int getCustomerid() {
			return customerid;
		}
		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		@Override
		public String toString() {
			return "CustomerAddress [customerid=" + customerid + ", street=" + street + ", city=" + city + ", zipCode="
					+ zipCode + "]";
		}
}
