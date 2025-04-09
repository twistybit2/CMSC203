//package Assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;


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


public class TwoDimRaggedArrayUtility {
	
	
	
	//READ FILE
	public static double[][] readFile(File file) throws FileNotFoundException {
		
		
		ArrayList<double[]> allRows = new ArrayList<>();
        //holds ALL the ROWS
		
		//scanner zone
		Scanner scanner = new Scanner(file);
		//end scanner zone
		
		
		
		
		
        while (scanner.hasNextLine()) { //Loop until it reaches the end
        	
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue; 

            String[] tokens = line.split("\\s+"); //To seperate the strings by spaces. I had to google this part :(
            
            
            double[] rowArray = new double[tokens.length]; //To store everything in the row

            for (int i = 0; i < tokens.length; i++) { //Get all the numbers in this row and add them to row
                rowArray[i] = Double.parseDouble(tokens[i]);
            }

            allRows.add(rowArray); //Add this row to the main arraylist
            
        } //REPEAT until you get through the whole thing

        scanner.close();
        return allRows.toArray(new double[0][]);
        	
	}
	
	
	
	//WRITE TO FILE
	public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
		
        PrintWriter writer = new PrintWriter(file); //the printwriterrr

        for (double[] row : data) { //Enhanced for loop: navigate between rows
        	
            for (int i = 0; i < row.length; i++) { //Regular for loop: navigate
            
            	writer.print(row[i]); //Write a single entry
                
            	if (i < row.length - 1) {
            		writer.print(" "); //Only add a space if it isn't the last one in the array
            	}
            }
            writer.println();//Newline for new row
        } //Repeat

        writer.close();
    }
	
	
	//Get TOTAL
	public static double getTotal(double[][] data) {
		
        double total = 0.0;
        for (double[] row : data) { //Nav between rows
            for (double val : row) { //Nav within rows
                total += val; //Add to total
            }
        }
        return total;
    }
	
	
	//get AVERAGE
	public static double getAverage(double[][] data) {
        
		double avery = 0.0; //Essentially the same as total
        int count = 0; //but also keep track of the count
        
        for (double[] row : data) { //Nav between rows
            for (double val : row) { //Nav within rows
                avery += val;
                count++;
            }
        }
        if (count == 0) { //Return 0 if there is no count as to not divide by 0
        	return 0;
        } else {
        	return avery / count; //Otherwise return average
        }
        
        
    }
	
	
	//get ROW TOTAL
	public static double getRowTotal(double[][] data, int row) {
        double total = 0.0;
        
        for (double val : data[row]) { //no need to nav rows this time bc we are given a specific row to look in
            total += val; //sum it up
        }
        return total;
    }
	
	
	//get COLUMN total
	public static double getColumnTotal(double[][] data, int col) {
        
		double total = 0.0;
        
		for (double[] row : data) { //navigate the column
            if (col < row.length) { //Skip the row if it's too short
                total += row[col]; //sum it up
            }
        }
        return total;
    }
	
	
	//get HIGHEST in a ROW
	public static double getHighestInRow(double[][] data, int row) {
		
        double max = data[row][0]; //set first thing as max for now
        
        for (double val : data[row]) {
            if (val > max) { //if you find anything bigger,
            	max = val; //that's the new max
            }
        }
        return max;
    }

	
	//Get the INDEX of the HIGHEST thing in the row
    public static int getHighestInRowIndex(double[][] data, int row) {
        
    	int index = 0; //set to 0 for now
        double max = data[row][0]; //set max as the first for now
        
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] > max) { //if you find anything bigger,
                max = data[row][i]; //that's the max
                index = i; //and remember where it is
            }
        }
        return index;
    }
    
    
    //find LOWEST in ROW
    public static double getLowestInRow(double[][] data, int row) {
        
    	double min = data[row][0]; //Set lowest as first for now
        
    	for (double val : data[row]) { //Same logic as the highest one
            if (val < min) {
            	min = val; //If you find a lower one, that's the new lowest, etc
            }
        }
        
    	return min;
    }
    
    //find INDEX of LOWEST thing in row
    public static int getLowestInRowIndex(double[][] data, int row) {
    	
        int index = 0;
        double min = data[row][0]; //Zeros and firsts
        
        for (int i = 1; i < data[row].length; i++) {
            if (data[row][i] < min) {
                min = data[row][i]; //Set the min
                index = i; //Get the index
                //ETC
            }
        }
        return index;
    }
    
    
    
    //Get HIGHEST in COLUMN
    public static double getHighestInColumn(double[][] data, int col) {
    	
        double max = -9999; //SOMETHING must be bigger than this
        
        for (double[] row : data) { 
            if (col < row.length && row[col] > max) { //Go down each row, at the column index
                max = row[col]; //If you find something bigger then set it as max
            }
        }
        return max;
    }
    
    
    //find the INDEX of the HIGHEST in the COLUMN
    public static int getHighestInColumnIndex(double[][] data, int col) {
        
    	int index = -1;
        double max = -9999; //there must be a greater number
        
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > max) { //Go down the columns
                max = data[i][col]; //If you find a max, set it
                index = i; //set the index
            }
        }
        return index;
    }

    
    //Get LOWEST in COLUMN
    public static double getLowestInColumn(double[][] data, int col) {
        
    	double min = 9999; //there must be a smaller one
        
        for (double[] row : data) {//Go down the columns
            if (col < row.length && row[col] < min) { //If you find a smaller thing
                min = row[col]; //Set it
            }
        }
        return min;
    }
    
    
    
    //get INDEX of LOWEST in COLUMN
    public static int getLowestInColumnIndex(double[][] data, int col) {
        
    	int index = -1;
        double min = 9999; //There MUST be a smaller number
        
        for (int i = 0; i < data.length; i++) { //Go down the rows
            if (col < data[i].length && data[i][col] < min) { //If you find a smaller thing
                min = data[i][col]; //That's the new min
                index = i; //Also get the index
            }
        }
        return index;
    }
    
    
    
    public static double getHighestInArray(double[][] data) {
        
    	double max = -9999; //lowest number 
        
    	for (double[] row : data) { //Nav between rows
            for (double val : row) { //Nav within a row
                if (val > max) {
                	max = val; //If you find something bigger than what we have, that's the new max
                }
            }
        }
        return max;
    }
    
    
    //GET LOWEST
    public static double getLowestInArray(double[][] data) {
    	
        double min = 9999; //ITS THE SAME LOGIC FOR THE ABOVE
        
        
        for (double[] row : data) {
            for (double val : row) {
                if (val < min) { //BUT WE LOOKIN FOR THE SMALLEST
                	min = val; 
                }
            }
        }
        return min;
    }
	
	
	
	


}
