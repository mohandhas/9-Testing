package com.accolite.TestAssignment;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	static FizzBuzz fizzBuzz;
	static Logger logger;
	
	@Before
	public void setUp() throws Exception 
	{	
		fizzBuzz = new FizzBuzz();
		logger = Logger.getLogger("FizzBuzz.class");
		BasicConfigurator.configure();
	}

	@Test
	public void testFiz() {
		logger.info("Fiz method produce output");
		assertEquals("Fizz", fizzBuzz.checkResult(9));
	}

	@Test
	public void testBuzz() {
		logger.info("Buzz method produce output");
		assertEquals("Buzz", fizzBuzz.checkResult(10));	}

	@Test
	public void testFizzBuzz() {
		logger.info("FizzBuzz method produce output");
		assertEquals("FizzBuzz", fizzBuzz.checkResult(15));
	}
	
	@Test
	public void testCheckResult()
	{
		logger.info("Default method produce output");
		assertEquals("8", fizzBuzz.checkResult(8));
	}
}
