//package Assignment5;


/*
 * Class: CMSC203 
 * Instructor: Prof Monshi
 * Description: A class with many methods to handle ragged arrays
 * Due: 04/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Jerrison Abrigo
*/

public class HolidayBonus {

    //ATTRIBUTE ZONE
    public static final double HIGHROLL = 5000.0;
    public static final double LOWROLL = 1000.0;
    public static final double OTHER = 2000.0;
    //End attribute zone
    

    //Calculates the bonus per district
    public static double[] calculateHolidayBonus(double[][] data) {
    	
        double[] bonuses = new double[data.length]; //To hold bonuses per store

        int maxColumns = 0;//to hold the number of columns
        
        for (int i = 0; i < data.length; i++) {//Go through each row
            if (data[i].length > maxColumns) { //If you find a longer one than the current one
                maxColumns = data[i].length; //Set it as the longest
            }
        }

        for (int col = 0; col < maxColumns; col++) { //Go through each column
        	
            int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col); //Find the highest and lowest
            int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

            
            for (int row = 0; row < data.length; row++) { //Go through each row
                if (col < data[row].length && data[row][col] >= 0) { //MAKE SURE THERE IS ACTUALLY SOMETHING THERE
                    if (row == highestIndex) {	 //If this row has the highest
                        bonuses[row] += HIGHROLL; //add the highroll
                    } else if (row == lowestIndex) { 
                        bonuses[row] += LOWROLL; //if it's got the lowest, give em the lowroll
                    } else {
                        bonuses[row] += OTHER;//and if else, just give em the other
                    }
                }
            }
        }

        return bonuses;
    }

    
    //Calculate total
    public static double calculateTotalHolidayBonus(double[][] data) {
    	
        double[] bonuses = calculateHolidayBonus(data);//call the above method
        double total = 0;

        for (double bonus : bonuses) {//go through each bonus
            total += bonus; //sum em up
        }

        return total;
    }
}