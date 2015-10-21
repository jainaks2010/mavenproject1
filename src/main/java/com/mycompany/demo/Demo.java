package com.mycompany.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.service.Service;
import com.mycompany.service.ServiceImpl;

public abstract class Demo {
	static Log logger = LogFactory.getLog(Demo.class);
	public static enum of{
		MULTIPLE_THREAD_INSERT,
		READ_UNCOMITTED,
		READ_COMMITED,
		REPEATABLE_READ,
		SERIALIZABLE
		
	}

	@Autowired
	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public abstract void demonstrate();
	//service.simpleTest("HelloWorld");
	//service.demoHibernateTxInsert();


	
	
	
	
}
