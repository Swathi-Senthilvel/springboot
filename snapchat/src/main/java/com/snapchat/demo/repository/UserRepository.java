package com.snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByusername(String username);
}