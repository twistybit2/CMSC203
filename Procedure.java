package Assignment2;

public class Procedure {
    // VARIAVLE ZONE
    private String name;
    private String date;
    private String practitioner;
    private double charges;

    /**
     * no args
     */
    public Procedure() {
        this.name = "";
        this.date = "";
        this.practitioner = "";
        this.charges = 0.0;
    }

    /**
     * Name and date only
     * @param name
     * @param date
     */
    public Procedure(String name, String date) {
        this.name = name;
        this.date = date;
    }

    /**
     * CONSTRUCTOR ALL
     * @param name
     * @param date
     * @param practitioner
     * @param charges
     */
    public Procedure(String name, String date, String practitioner, double charges) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    // GETTERS
    public String getProcedureName() {
        return name;
    }

    public String getProcedureDate() {
        return date;
    }

    public String getPractitionerName() {
        return practitioner;
    }

    public double getCharges() {
        return charges;
    }

    
    // SETTERS
    public void setName(String input) {
        this.name = input;
    }

    public void setDate(String input) {
        this.date = input;
    }

    public void setPractitioner(String input) {
        this.practitioner = input;
    }

    public void setCharges(double input) {
        this.charges = input;
    }

    /**
     * 
     * Combines everything into a srting
     */
    public String toString() {
        return "	Procedure: " + name + "\n" +
               "	Date: " + date + "\n" +
               "	Practitioner: " + practitioner + "\n" +
               "	Charges: $" + (charges) + "\n";
    }
}
