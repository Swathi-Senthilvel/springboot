package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
