package com.mycompany.app;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JunitTest1 {

	static Log logger = LogFactory.getLog(JunitTest1.class);

	@Test
	public void test() {
		
		logger.info("Running Junit1 class");
		assertTrue(true);
	}

}
