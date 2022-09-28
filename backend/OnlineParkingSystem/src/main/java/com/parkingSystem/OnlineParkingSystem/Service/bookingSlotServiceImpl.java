package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parkingSystem.OnlineParkingSystem.Model.BookingSlot;
import com.parkingSystem.OnlineParkingSystem.repositories.BookingSlotRepository;


@Service
public class bookingSlotServiceImpl implements BookingSlotService {

	@Autowired
	private BookingSlotRepository bookingSlotRepo;
	
	

	@Override
	public List<BookingSlot> getbookingSlot() {
		List<BookingSlot> a1 = new ArrayList<>();
		try {
			bookingSlotRepo.findAll().forEach(a1::add);
			return a1;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public BookingSlot searchBookingSlot(int id) {
		
		try {
			Optional<BookingSlot> opt = bookingSlotRepo.findById(id);
			
			if(opt.isPresent()) {
				BookingSlot v = opt.get();
				return v; 
			}else {
				return null;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean insertBookingSlot(BookingSlot bookingSlot) {
		
		try {
			bookingSlotRepo.save(bookingSlot);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateBookingSlot(BookingSlot bookingSlot) {
		try {
			Optional<BookingSlot> opt = bookingSlotRepo.findById(bookingSlot.getBookingid());
			if(opt.isPresent()) {
				bookingSlotRepo.save(bookingSlot);
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteBookingSlot(int id) {
		try {
			Optional<BookingSlot> opt = bookingSlotRepo.findById(id);
			
			if(opt.isPresent()) {
				bookingSlotRepo.deleteById(id);
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	

}
