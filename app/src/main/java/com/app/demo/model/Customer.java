
package com.app.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;

@Entity
//@Table(name="spectators")

public class Customer
{
	@Id
	@GeneratedValue
	private int customerid;
	private String name;
    private String email;
    private String password;
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="customer_id")
  private CustomerAddress address;
	public CustomerAddress getAddress() {
		return address;
	}
	public void setAddress(CustomerAddress address) {
		this.address = address;
	} 	
     public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Spectator [customerid=" + customerid + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}
}



