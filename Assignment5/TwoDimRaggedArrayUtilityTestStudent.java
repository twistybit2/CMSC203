package Assignment5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {

    private double[][] dataSet1 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
    
    @Before
    public void setUp() throws Exception {
        
    }

    @After
    public void tearDown() throws Exception {
       
    }

    
    @Test
    public void testGetRowTotal() {
        // Row 1 is {4, 5}, so the total should be 9
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), 0.001);
    }


    @Test
    public void testGetColumnTotal() {
        // Column 1 has values {2, 5, 7}, so the total should be 14
        assertEquals(14.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1), 0.001);
    }


    @Test
    public void testGetTotal() {
        assertEquals(45.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), 0.001);
    }


    @Test
    public void testGetAverage() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), 0.001);
    }


    @Test
    public void testGetHighestInRow() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2), 0.001);
    }


    @Test
    public void testGetHighestInRowIndex() {
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
    }


    @Test
    public void testGetLowestInRow() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0), 0.001);
    }


    @Test
    public void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0));
    }

 
    @Test
    public void testGetHighestInColumn() {
        assertEquals(6.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), 0.001);
    }


    @Test
    public void testGetHighestInColumnIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0));
    }


    @Test
    public void testGetLowestInColumn() {
        assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 1), 0.001);
    }

    
    @Test
    public void testGetLowestInColumnIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 1));
    }


    @Test
    public void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 0.001);
    }


    @Test
    public void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), 0.001);
    }
}
