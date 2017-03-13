package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testCase1 {
		
	private Vista vista = new Vista();
	
	@Before
	public void setUp() throws Exception {
		
		vista.setUp();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		vista.screen1();
		vista.screen2();
		vista.screen3();
		vista.screen4();
		vista.screen5();
		vista.screen678();
	}
}
