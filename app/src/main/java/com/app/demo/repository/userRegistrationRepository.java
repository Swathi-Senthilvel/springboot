package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.model.Registration;



@Repository
public interface userRegistrationRepository extends JpaRepository<Registration,Integer>{

}

