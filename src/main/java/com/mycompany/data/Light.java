package com.mycompany.data;

import java.io.Serializable;

public class Light implements Serializable {

	private Long lightId;
	private String lightName;
	private Event event;
	 
	public Long getLightId() {
		return lightId;
	}
	public void setLightId(Long lightId) {
		this.lightId = lightId;
	}

	public String getLightName() {
		return lightName;
	}
	public void setLightName(String lightName) {
		this.lightName = lightName;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}

}
