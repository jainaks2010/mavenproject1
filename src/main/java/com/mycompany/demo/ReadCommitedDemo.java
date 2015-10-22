package com.mycompany.demo;

import com.mycompany.data.Event;

public class ReadCommitedDemo extends Demo implements Restorable {

	@Override
	public void demonstrate() {
		restore();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				getService().readCommited(new Long(1));
			}},"First");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Event event = getService().getEvent(new Long(1));
				event.setName("Dandia Night");
				getService().updateEvent(event);
			}
		},"Second");
		thread2.start();
		try{
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{}
	}

	@Override
	public void restore() {
		Event event = getService().getEvent(new Long(1));
		event.setName("Rock Performance");
		getService().updateEvent(event);
	}

}
