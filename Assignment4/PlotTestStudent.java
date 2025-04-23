package Assignment4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203 
 * Instructor: Prof Monshi
 * Description: This is my JUnit test for the plot class
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jerrison Abrigo
*/


class PlotTestStudent {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOverlaps() {
		Plot funnyA = new Plot(0, 0, 10, 10);
        Plot funnyB = new Plot(5, 5, 10, 10); // funny a and b overlap partially
        assertTrue(funnyA.overlaps(funnyB));
        assertTrue(funnyB.overlaps(funnyA));
        
        Plot funnyC = new Plot (10, 10, 10, 10); //funny c does not overlap funny a
        assertTrue(!funnyA.overlaps(funnyC));
	}
	
	@Test
	void testEncompasses() {
		Plot funkyA = new Plot (0, 0, 10, 10);
		Plot funkyB = new Plot (1,1,1,1); //funkyB is contained entirely within funkyA
		
		assertTrue(funkyA.encompasses(funkyB));
		
	}

}
