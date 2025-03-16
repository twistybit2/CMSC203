package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook wahoo;
	private GradeBook yippee;

	
	
	@BeforeEach
	void setUp() throws Exception {
		
		wahoo = new GradeBook(5);

        wahoo.addScore(88.5);
        wahoo.addScore(76.0);
        wahoo.addScore(92.3);
        wahoo.addScore(85.7);
        wahoo.addScore(90.1);
        
        yippee = new GradeBook(5);
        
        yippee.addScore(11.1);
        yippee.addScore(22.2);
        yippee.addScore(33.3);
        

        

	
	
	}

	@AfterEach
	void tearDown() throws Exception {
		
		wahoo = null;
		yippee = null;

	}

	@Test
	void testAddScore() {
		
		assertTrue(yippee.toString().equals("11.1 22.2 33.3 ")); //Returns true if everything matches
		assertEquals(3, yippee.getScoresSize());
		
		assertTrue(wahoo.toString().equals("88.5 76.0 92.3 85.7 90.1 "));
		assertEquals(5, wahoo.getScoresSize());
	}
	
	@Test
	void testSum() {
		
		assertEquals(11.1+22.2+33.3, yippee.sum()); //Sum it up
		
		assertEquals(88.5+76.0+92.3+85.7+90.1, wahoo.sum());
	}
	
	@Test
	void testMinimum() {
		assertEquals(11.1, yippee.minimum());
		
		assertEquals(76.0, wahoo.minimum());
	}
	
	@Test
	void testFinalScore () {
		
		assertEquals(yippee.sum()-yippee.minimum(), yippee.finalScore()); //Final = sum - minimum
		
		assertEquals(wahoo.sum()-wahoo.minimum(), wahoo.finalScore());
	}

}
