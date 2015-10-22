package com.mycompany.dao;

import com.mycompany.data.Event;

public interface EventDAO {
	
	public Event createEvent(String name);
	
	public Event getEventByName(String name);
	
	public Event getEventById(Long id);
	
	public boolean deleteEventsByName(String name);
	
	public void updateEvent(Event event);

}
