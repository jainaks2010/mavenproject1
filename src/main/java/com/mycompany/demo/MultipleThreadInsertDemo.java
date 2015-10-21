package com.mycompany.demo;


public class MultipleThreadInsertDemo extends Demo {

	@Override
	public void demonstrate() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				getService().demoHibernateTxInsert();
			}
		},"First"); 
        Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				getService().demoHibernateTxInsert();
			}
		},"Second"); 
        
        thread1.start();
        thread2.start();
	}

}
