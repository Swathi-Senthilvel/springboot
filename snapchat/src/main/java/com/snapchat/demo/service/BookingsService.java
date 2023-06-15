
package com.snapchat.demo.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.snapchat.demo.model.Bookings;
import com.snapchat.demo.repository.BookingsRepository;

import jakarta.transaction.Transactional;

@Service
public class BookingsService {
    @Autowired
    private BookingsRepository bookingRepository;

    public List<Bookings> getAllBookings() {
        List<Bookings> bookingList = bookingRepository.findAll();
        return bookingList;
    }

    public Bookings saveBooking(Bookings booking) {
        Bookings savedBooking = bookingRepository.save(booking);
        return savedBooking;
    }

    public Bookings updateBooking(Bookings booking) {
        Bookings updatedBooking = bookingRepository.save(booking);
        return updatedBooking;
    }

    //public Booking updateBooking(Booking booking, int bookingId) {
        //Optional<Booking> optional = bookingRepository.findById(bookingId);
      //  Booking updatedBooking = null;
//        if (optional.isPresent()) {
//            updatedBooking = optional.get();
//            // Update the booking properties here
//            updatedBooking.setProperty(booking.getProperty());
//            // Set other properties of the booking object
//            bookingRepository.save(updatedBooking);
//        }
       // return updatedBooking;
  //  }

    public void deleteBooking(int bookingId) {
        bookingRepository.deleteById(bookingId);
    }
//
//    public List<Booking> sortBookings(String field) {
//        return bookingRepository.findAll(Sort.by(field));
//    }
//
//    public Page<Booking> getPageBooking(int offset, int pageSize) {
//        PageRequest paging = PageRequest.of(offset, pageSize);
//        Page<Booking> pageOfBookings = bookingRepository.findAll(paging);
//        return pageOfBookings;
//    }
//
//    public List<Booking> getPageAndSortBookings(int offset, int pageSize, String field) {
//        PageRequest paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
//        Page<Booking> pageOfBookings = bookingRepository.findAll(paging);
//        return pageOfBookings.getContent();
//    }
//
//	public static Page<Booking> pagingBooking(int offset, int pageSize) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public List<Bookings> sortBookings(String name) 
	{
	    // Ascending Order return playRepository.findAll(Sort.by(name));
		return bookingRepository.findAll(Sort.by(name));
		
	}
	public Page<Bookings> pagingBooking(int offset, int pageSize) 
	{
		PageRequest paging = PageRequest.of(offset, pageSize);
		Page<Bookings> bookingData=bookingRepository.findAll(paging);
		//List<Player> playList=playData.getContent();
		return bookingData;
	}
	
	public List<Bookings>pagingAndSorting(int offset,int pageSize,String field)
	{
		PageRequest paging = PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Bookings> play = bookingRepository.findAll(paging);
		return play.getContent();
	}
	public List<Bookings> fetchTeamByPrefix(String prefix)
	{
		return bookingRepository.findByNameStartingWith(prefix);
	}
	public List<Bookings> fetchTeamBySuffix(String suffix)
	{
		return bookingRepository.findByNameEndingWith(suffix);
	}
	
	public List<Bookings> getBookingsByTeam(String team,String name)
	{
		return bookingRepository.getBookingsByTeam(team,name);
	}
	
@Transactional
public int deleteBookingByName(String name)
{
	return bookingRepository.deleteBookingByName(name);
}

@Transactional
public int updateBookingByName(String team,String name)
{
	return bookingRepository.updateBookingByName(team,name);
}
	
public List<Bookings> fetchBookingsByTeam(String team)
{
	return bookingRepository.fetchBookingsByTeam(team);
}
	
	}
