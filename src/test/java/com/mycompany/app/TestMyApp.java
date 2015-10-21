package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.demo.Demo;
import com.mycompany.demo.DemoFactoryBean;
import com.mycompany.service.Service;

import static  org.junit.Assert.*;


public class TestMyApp {
	
	ApplicationContext applicationContext ;
	
	@Before
	public void setUp(){
		String[] paths = { 
				"applicationContext.xml"				
		};
		applicationContext = new ClassPathXmlApplicationContext(paths);
	}
	
	@Test
	public void testMyApp(){
		final DemoFactoryBean demoFactoryBean = applicationContext.getBean(DemoFactoryBean.class);
		Demo demo = demoFactoryBean.getDemoOf(Demo.of.MULTIPLE_THREAD_INSERT);
		demo.demonstrate();
		assertTrue(true);
	}

}
