package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.CoreMatchers.*;

import com.mycompany.service.Service;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAnnotationTest {
	
	@Autowired
	private Service service;
	
	@Test
	public void testService(){
		String result = service.simpleTest("HelloWorld");
		assertNotNull(result);
		assertThat(result,is("helloworld"));
	}
}
