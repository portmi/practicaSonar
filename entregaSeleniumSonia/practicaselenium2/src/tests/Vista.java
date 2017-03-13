package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tests.Proces;

public class Vista {
	
	private Proces proces = new Proces();
	
	@Before
	public void setUp() throws Exception {
	
		proces.setUp();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void screen1 () {
		proces.click1();
	}
	
	@Test
	public void screen2 () {
		proces.click2();		
	}
	
	@Test
	public void screen3 () {
		proces.click3();
	}	
	
	
	@Test
	public void screen4 () {	
		proces.click4();
	}
	
	@Test
	public void screen5 () {
			
		proces.click5();
	}
	

	@Test
	public void screen678 () {
		
		proces.click678();
			

	}

}
