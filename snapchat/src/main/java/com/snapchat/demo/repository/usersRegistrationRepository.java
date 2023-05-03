package com.snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Registrations;



@Repository
public interface usersRegistrationRepository extends JpaRepository<Registrations,Integer>{

}
