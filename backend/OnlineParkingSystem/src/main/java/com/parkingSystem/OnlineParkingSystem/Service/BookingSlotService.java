package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.List;

import com.parkingSystem.OnlineParkingSystem.Model.BookingSlot;


//import com.cdac.FinalProject.pojo.Vehicle;

public interface BookingSlotService {

List<BookingSlot> getbookingSlot();
	
	BookingSlot searchBookingSlot(int id);
	
	boolean insertBookingSlot(BookingSlot bookingSlot);
	boolean updateBookingSlot(BookingSlot bookingSlot);
	boolean deleteBookingSlot(int id);
}
