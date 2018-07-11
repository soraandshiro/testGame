package model;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;

public class MapCaseTest {
	
	private MapCase mapTest;

	 /**
		 * Set up the test configuration.
		 * 
		 * @throws Exception
		 * 			Signals that an exception has occurred
		 */
	
	@Before
	public void setUp() throws Exception {
		mapTest = new MapCase();
	}

	/**
	 * 
	 * test for getting the Height
	 * 
	 */
	@Test
	public void testgetHeight() {
		int expected = 400;
		assertEquals(expected,mapTest.getHeight());
	}
	
	/**
	 * 
	 * test for setting the Height
	 * 
	 */
	@Test
	public void testsetHeight() {
		int expected = 400;
		mapTest.setHeight(400);
		assertEquals(expected,mapTest.getHeight());
	}

}
