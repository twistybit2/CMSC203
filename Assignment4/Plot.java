package Assignment4;

/*
 * Class: CMSC203 
 * Instructor: Prof Monshi
 * Description: The Plot class has coordinate attributes, and a width+depth attributes to define a rectangle. Has methods for overlap and encompassing
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jerrison Abrigo
*/


public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	//end attribute zone
	
	//Setters, getters. constructors galore
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	//constructor
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	//no args constructor
	public Plot(){
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		
	}
	//copy constructor
	public Plot(Plot otherPlot) {
	    this.x = otherPlot.x;
	    this.y = otherPlot.y;
	    this.width = otherPlot.width;
	    this.depth = otherPlot.depth;
	}

	
	//end road work
	
	
	
	public boolean overlaps(Plot funky) {
        // One rectangle is completely to the left, right, above, or below the other
		boolean overlaps;
        overlaps = !(x + width <= funky.x ||        // this is left of funky
                 funky.x + funky.width <= x ||  // funky is left of this
                 y + depth <= funky.y ||        // this is above funky
                 funky.y + funky.depth <= y);   // funky is above this
        
        return overlaps; //if any of this is true then it's overlaps
    }
	
	
	//encompasses
	public boolean encompasses(Plot funky) {
        boolean encompasses;
		
		encompasses = (this.x <= funky.x && //left edge of this is within left edge of funky
                this.y <= funky.y && //top of this is below the top of funky
                this.x + this.width >= funky.x + funky.width && //the right of this is within the right of funky
                this.y + this.depth >= funky.y + funky.depth); //the bottom of this is above funky
		
		return encompasses;
    }

    // TOSTRING
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
	
	

}
