package com.mycompany.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.dao.EventDAO;
import com.mycompany.data.Event;

public class ServiceImpl implements Service{
	
	static Log logger = LogFactory.getLog(ServiceImpl.class);
	
	static boolean generateError  = true;  
	
	static int calltime =0;
	
	@Autowired
	private EventDAO dao;
	
	public ServiceImpl() {
	}

	public String simpleTest(String string) {
		return string.toLowerCase();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean demoHibernateTxInsert() {
		int call=calltime++;
		logger.info("In the method");
		for(int i=0;i<10;i++){
			String name = "test-"+call+"-"+i;
			logger.info("Event name:"+name);
			dao.createEvent(name);
		}
		if(generateError){
			generateError =false;
			logger.info("Trying with null");
			dao.createEvent(null);
		}
		return true;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_UNCOMMITTED)
	public Event addEvent(String name) {
		Event event = dao.createEvent(name);
		logger.info("Added event with name"+event.getName()+" with id = "+event.getEventId());
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean deleteEventsByName = dao.deleteEventsByName(name);
		logger.info("Deleted the event and delete is "+deleteEventsByName);
		return event;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE)
	public Event getEvent(String name) {
		Event event = dao.getEventByName(name);
		return event;
	}

	@Override
	public Event getEvent(Long eventId) {
		return dao.getEventById(eventId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE)
	public boolean deleteEventByName(String name) {
		boolean deleteEventsByName = dao.deleteEventsByName(name);
		return deleteEventsByName;
	}
}
