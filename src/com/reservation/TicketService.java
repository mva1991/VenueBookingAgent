package com.reservation;

import java.util.ArrayList;

public interface TicketService {

	int numSeatsAvaliable(Integer venueLevel);
	ArrayList<Seat> findAndHoldSeats(int numSeats , Integer minLevel , Integer maxLevel , String customerEmail) throws Exception;
	boolean reserveSeats(int numSeats, String customerEmail);
	
}

