package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.awt.Color;

public class RiderTest {
	
	private Rider joueur;
	private MapCase rider1;

	 /**
		 * Set up the test configuration.
		 * 
		 * @throws Exception
		 * 			Signals that an exception has occurred
		 */
	
	@Before
	public void setUp() throws Exception {
		joueur = new Rider(10, 12, Color.red, Direction.TOP, rider1 );
	}
	
	/**
	 * 
	 * Test for getting the function Alive
	 * 
	 */

	@Test
	public void testIsAlive() {
		boolean expected = true;
		assertEquals(expected,joueur.isAlive());
	}
	
	/**
	 * 
	 * Test for setting function Alive
	 * 
	 */

	@Test
	public void testSetAlive() {
		boolean expected = true;
		joueur.setAlive(true);
		assertEquals(expected,joueur.isAlive());
	}

}
