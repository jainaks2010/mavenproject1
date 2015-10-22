package com.mycompany.demo;

import com.mycompany.data.Event;

public class ReadUncommitedDemo extends Demo implements Restorable {

	@Override
	public void demonstrate() {
		restore();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				getService().addEvent("dandia");
			}
		},"First"); 
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Event event = getService().getEvent("dandia");
				if(event != null){
					logger.info("Read uncommited event name as :-"+event.getName()+" id="+event.getEventId());	
				}else{
					logger.info("Event is null");
				}
			}
		},"Second"); 
		thread2.start();
	}

	@Override
	public void restore() {
		getService().deleteEventByName("dandia");
	}

}
