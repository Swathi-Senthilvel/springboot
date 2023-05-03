package com.snapchat.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Spectator;

@Repository
public interface SpectatorRepository extends JpaRepository<Spectator,Long> {

}
