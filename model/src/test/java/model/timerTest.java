package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class timerTest {

	private timer tooLong;
	
	@Before
	public void setUp() throws Exception {
		tooLong = new timer();
	}

	@Test
	public void testGetTime() {
		int expected = 5;
		tooLong.setTime(5);
		assertEquals(expected, tooLong.getTime());
		System.out.println(tooLong);
	}

}
