package com.parkingSystem.OnlineParkingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.OnlineParkingSystem.Model.BookingSlot;
import com.parkingSystem.OnlineParkingSystem.Service.BookingSlotService;


@RestController
public class BookingSlotController {

	
	@Autowired
	private BookingSlotService bookingRepo;
	
	@GetMapping(value = "/getbookingSlot")
	public List<BookingSlot> getbookingSlot(){
		
		List<BookingSlot> lst = bookingRepo.getbookingSlot();
		return lst;
	}
	
	
	@GetMapping(value="/searchBookingSlot/{id}")
	public BookingSlot searchBookingSlot(@PathVariable("id") int vid) {
		BookingSlot v = bookingRepo.searchBookingSlot(vid);
		return v;
		
	}
	
	
	@PostMapping(value ="/insertBookingSlot")
		public boolean insertBookingSlot(@RequestBody  BookingSlot bookingSlot) {
		
		if(bookingRepo.insertBookingSlot(bookingSlot)) {
			return true;
		}else {
			return false;
		}
			
	}
	
	@PutMapping(value="/updateBookingSlot")
	public boolean updateBookingSlot(@RequestBody BookingSlot bookingSlot) {
		
		if(bookingRepo.updateBookingSlot(bookingSlot)) {
			return true;
		}else {
			return false;
		}
	}
	
	@DeleteMapping(value="/deleteVehicle/{id}")
	public boolean deleteVehicl(@PathVariable("id") int vid) {
		
		
		if(bookingRepo.deleteBookingSlot(vid)) {
			return true;
		}else {
			return false;
		}
		
	}
}
