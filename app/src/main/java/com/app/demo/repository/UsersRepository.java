package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	Users findByusername(String username);
}