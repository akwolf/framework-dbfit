package com.justsy.dbfit.core;

import org.jtester.testng.JTester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoggerTest extends JTester {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void test() {
		logger.info("zhang {} hello world !!","hua") ;
	}
}
