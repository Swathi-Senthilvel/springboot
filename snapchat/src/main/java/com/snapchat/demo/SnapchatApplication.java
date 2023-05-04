package com.snapchat.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(
		title="Ipl Booking",
		version="1.1.2",
		description="Booking",
		contact=@Contact(name="Swathi",email="727821tuec239@skct.edu.in")))
public class SnapchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnapchatApplication.class, args);
	}

}
