package com.mycompany.data;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event implements Serializable,Comparable<Event>,Comparator<Event>{
	public Event() {
	}
	public Event(String name, Date date) {
		this.name = name;
		this.eventDate = date;
	}
	private Long eventId;
	private String name;
	private Date eventDate;
	private Set<Light> lights = new  HashSet<Light>();
	
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	
	@Override
	public String toString() {
		return "[eventId = "+eventId+"] [name = "+name+"] [eventDate = "+eventDate+"]";
	}
	@Override
	public int compareTo(Event event) {
		System.out.println("Called comapreTo");
		return eventId.compareTo(event.getEventId());
	}
	@Override
	public int compare(Event event1, Event event2) {
		System.out.println("Called compare");
		return event1.getEventId().compareTo(event2.getEventId());
	}
	public Set<Light> getLights() {
		return lights;
	}
	public void setLights(Set<Light> lights) {
		this.lights = lights;
	}
}
