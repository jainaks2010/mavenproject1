package com.mycompany.service;

import com.mycompany.data.Event;

public interface Service {
	
	String simpleTest(String string);
	
	boolean demoHibernateTxInsert();

	Event addEvent(String name);
	
	Event getEvent(String name);
	
	Event getEvent(Long eventId);
	
	boolean deleteEventByName(String name);

	void updateEvent(Event event);

	void readCommited(Long eventId);
}
