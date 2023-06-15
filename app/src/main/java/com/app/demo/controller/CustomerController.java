package com.app.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.demo.model.Customer;
import com.app.demo.service.CustomerService;

@RestController
public class CustomerController
{
	@Autowired
     CustomerService personserv;
	@GetMapping("/getAllpersons")
		public List<Customer>fetchAllSpectators()
		{
			return personserv.fetchAllSpectators();
    	}
}
