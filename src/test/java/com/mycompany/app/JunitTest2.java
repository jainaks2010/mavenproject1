package com.mycompany.app;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JunitTest2 {
	
	static Log logger = LogFactory.getLog(JunitTest2.class);

	@Test
	public void test() {
		
		logger.info("Running Junit2 class");
		assertTrue(true);
	}

}
