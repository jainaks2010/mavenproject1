package com.mycompany.data;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Serializable{
	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	private Long personId;
	private String name;
	private Integer age;
	private Set<Event> events ;
	private Map<String,String> clothesInformation;
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
			return "[eventId = "+personId+"] [name = "+name+"] [age = "+age+"]";
	}
	public Set getEvents() {
		return events;
	}
	public void setEvents(Set events) {
		this.events = events;
	}

	public Map<String, String> getClothesInformation() {
		return clothesInformation;
	}

	public void setClothesInformation(Map<String, String> clothesInformation) {
		this.clothesInformation = clothesInformation;
	}
}
