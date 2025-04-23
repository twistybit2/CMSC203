package Assignment4;
/*
 * Class: CMSC203 
 * Instructor: Prof Monshi
 * Description: this is the junit test for property class
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jerrison Abrigo
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {

	
	Plot funnyPlot = new Plot(1, 2, 3, 4);
	Property propTest1 = new Property("TestName", "TestCity", 1500.0, "TestOwner", funnyPlot);
	
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
	
	
	//tests the get name
	@Test
	void getNameTest() {
		assertEquals("TestName", propTest1.getName());
		
	}
	
	//tests the getcity
	@Test
	void getCityTest() {
		assertEquals("TestCity", propTest1.getCity());   
	}

	//get rent
	@Test
	void getRentTest() {
		assertEquals(1500.0, propTest1.getRent());
	}
	
	//get owner
	@Test
	void getOwnerTest() {
		assertEquals("TestOwner", propTest1.getOwner());
	}
	
	//get plot
	@Test
	void getPlot() {
		assertEquals(1, propTest1.getPlot().getX());
	    assertEquals(2, propTest1.getPlot().getY());
	    assertEquals(3, propTest1.getPlot().getWidth());
	    assertEquals(4, propTest1.getPlot().getDepth());
	}

	

}
