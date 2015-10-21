package com.mycompany.data;

import java.util.Comparator;

public class EventSorter implements Comparator<Event>{

	@Override
	public int compare(Event o1, Event o2) {
		
		return o1.getEventId().compareTo(o2.getEventId());
	}
	

}
