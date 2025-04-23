package Assignment4;

/*
 * Class: CMSC203 
 * Instructor: Prof Monshi
 * Description: The property class has attributes for name, city, rent, owner, and plot. It has a tostring method.
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jerrison Abrigo
*/


public class Property {
	private String name;
    private String city;
    private double rent;
    private String owner;
    private Plot plot;
    
    //setters, getters, and the like
	public String getName() {
		return name;
	}
	public void setName(String propertyName) {
		this.name = propertyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rentAmount) {
		this.rent = rentAmount;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Plot getPlot() {
		return plot;
	}
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	//end settergetter
	
	//constructor
	public Property(String propertyName, String city, double rentAmount, String owner, Plot plot) {
		super();
		this.name = propertyName;
		this.city = city;
		this.rent = rentAmount;
		this.owner = owner;
		this.plot = plot;
	}
	
	//no args
	public Property() {
		super();
		this.name = "House";
		this.city = "Rockville";
		this.rent = 2.0;
		this.owner = "Jerrison Abrigo";
		this.plot = new Plot (0,0,1,1);
	}
	
	//CONSTRUCTOR WITH NO PLOT BC APPARENTLY I NEED THAT
	public Property(String propertyName, String city, double rentAmount, String owner) {
        this.name = propertyName;
        this.city = city;
        this.rent = rentAmount;
        this.owner = owner;
        this.plot = new Plot(); // default plot
    }
	
	//CONSTRUCTOR WITH SEPERATE PLOT PARAMS BC APPARENTLY I NEED *THAT* TOO!!!
	public Property(String propertyName, String city, double rentAmount, String owner,
	                int x, int y, int width, int depth) {
	    this.name = propertyName;
	    this.city = city;
	    this.rent = rentAmount;
	    this.owner = owner;
	    this.plot = new Plot(x, y, width, depth);
	}

	//copy constructor
	public Property(Property otherProperty) {
	    this.name = otherProperty.name;
	    this.city = otherProperty.city;
	    this.rent = otherProperty.rent;
	    this.owner = otherProperty.owner;
	    this.plot = new Plot(otherProperty.plot);
	}

	
	
	//tostring
	@Override
    public String toString() {
        return name + "," + city + "," + owner + "," + rent;
    }
	
	

}
