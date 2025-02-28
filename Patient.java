package Assignment2;

public class Patient {
	
	
    // VARIABLE ZONE
    private String firstName, secondName, thirdName;
    private String streetAddress, city, state, ZIP;
    private String phoneNumber;
    private String emergencyName, emergencyNumber;

    // CONSTRUCTOR ZONE
    
    
    /*
     * 
     * constructor for no args given
     */
    public Patient() {
        this.firstName = "";
        this.secondName = "";
        this.thirdName = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.ZIP = "";
        this.phoneNumber = "";
        this.emergencyName = "";
        this.emergencyNumber = "";
    }

    /**
     * Constructor for names only
     * @param firstName
     * @param secondName
     * @param thirdName
     */
    public Patient(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }
    
    
    
    /**
     *Constructor for every single parameter 
     * @param firstName
     * @param secondName
     * @param thirdName
     * @param streetAddress
     * @param city
     * @param state
     * @param ZIP
     * @param phoneNumber
     * @param emergencyContactName
     * @param emergencyContactPhone
     */
    public Patient(String firstName, String secondName, String thirdName, String streetAddress, 
                   String city, String state, String ZIP, String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.ZIP = ZIP;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyContactName;
        this.emergencyNumber = emergencyContactPhone;
    }


    // GETTERS
    public String getFirstName() { 
    	return firstName;
    }
    
    public String getMiddleName() {
    	return secondName;
    }
    
    public String getLastName() {
    	return thirdName;
    }
    
    public String getStreetAddress() {
    	return streetAddress;
    }
    public String getCity() {
    	return city;
    }
    
    public String getState() {
    	return state;
    }
    
    public String getZIP() {
    	return ZIP;
    }
    
    public String getPhoneNumber() {
    	return phoneNumber;
    }
    
    public String getEmergencyName() {
    	return emergencyName;
    }
    
    public String getEmergencyPhone() {
    	return emergencyNumber;
    }
    

    // SETTERS
    public void setFirstName(String input) { 
    	this.firstName = input; 
    }
    
    public void setMiddleName(String input) { 
    	this.secondName = input; 
    }
    
    public void setLastName(String input) { 
    	this.thirdName = input; 
    }
    
    public void setStreetAddress(String input) { 
    	this.streetAddress = input; 
    }
    
    public void setCity(String input) { 
    	this.city = input; 
    }
    
    public void setState(String input) { 
    	this.state = input; 
    }
    
    public void setZIP(String input) { 
    	this.ZIP = input; 
    }
    
    public void setPhoneNumber(String input) { 
    	this.phoneNumber = input; 
    }
    
    public void setEmergencyContactName(String input) { 
    	this.emergencyName = input; 
    }
    
    public void setEmergencyContactPhone(String input) { 
    	this.emergencyNumber = input; 
    }
    
    
    // Methods that build things
    
    /**
     * return name concatenated together
     * @return
     */
    public String buildFullName() {
        return firstName + " " + secondName + " " + thirdName;     
    }
    
    
    /**
     * Return address concatenated
     * @return
     */
    public String buildAddress() {
        return streetAddress + ", " + city + ", " + state + " " + ZIP;
    }
 
    /**
     * Returns emergency concatenated together
     * @return
     */
    public String buildEmergencyContact() {
        return emergencyName + " - " + emergencyNumber;
    }


    // toString method
    public String toString() {
        return "Patient Information:\n" +
               "  Full Name: " + buildFullName() + "\n" +
               "  Address: " + buildAddress() + "\n" +
               "  Phone Number: " + phoneNumber + "\n" +
               "  Emergency Contact: " + buildEmergencyContact();
    }
}

