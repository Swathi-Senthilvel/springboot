package com.app.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.model.Customer;
import com.app.demo.repository.CustomerRepository;
import java.util.List;


@Service
public class CustomerService 
{
	@Autowired
   CustomerRepository personRepo;
		public List<Customer>fetchAllSpectators()
		{
			return personRepo.findAll();
		}
		public Customer saveCustomer(Customer p)
		{
			return personRepo.save(p);
		}
}
