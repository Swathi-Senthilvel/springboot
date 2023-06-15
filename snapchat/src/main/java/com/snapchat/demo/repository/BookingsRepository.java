
package com.snapchat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.snapchat.demo.model.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Integer> {
    @Query("SELECT b FROM Booking b WHERE b.team = ?1 AND b.name = ?2")
    public List<Bookings> getBookingsByTeam(String team, String name);

    @Query("SELECT b FROM Booking b WHERE b.team = :team")
    public List<Bookings> getBookingsByTeam(String team);

    List<Bookings> findByNameStartingWith(String prefix);

    List<Bookings> findByNameEndingWith(String suffix);

    List<Bookings> findByTeam(String team);

    @Modifying
    @Query("DELETE FROM Booking b WHERE b.name = ?1")
    public int deleteBookingByName(String name);

    @Modifying
    @Query("UPDATE Booking b SET b.team = ?1 WHERE b.name = ?2")
    public int updateBookingByName(String team, String name);

    @Query(value = "SELECT * FROM bookings WHERE team = ?1", nativeQuery = true)
    public List<Bookings> fetchBookingsByTeam(String team);
}