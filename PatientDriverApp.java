package Assignment2;

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // OBJECT ZONE
        Patient patient = new Patient();
        Procedure procedure1 = new Procedure();
        Procedure procedure2 = new Procedure();
        Procedure procedure3 = new Procedure();
        

        // Get patient info
        System.out.print("Enter First Name: ");
        patient.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        patient.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        patient.setLastName(scanner.nextLine());

        System.out.print("Enter Street Address: ");
        patient.setStreetAddress(scanner.nextLine());

        System.out.print("Enter City: ");
        patient.setCity(scanner.nextLine());

        System.out.print("Enter State: ");
        patient.setState(scanner.nextLine());

        System.out.print("Enter ZIP Code: ");
        patient.setZIP(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        patient.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Emergency Contact Name: ");
        patient.setEmergencyContactName(scanner.nextLine());

        System.out.print("Enter Emergency Contact Phone Number: ");
        patient.setEmergencyContactPhone(scanner.nextLine());

        
        // Get procedure info 1
        System.out.print("\n\nEnter name for Procedure 1: ");
        procedure1.setName(scanner.nextLine());

        System.out.print("Enter practitioner for Procedure 1: ");
        procedure1.setPractitioner(scanner.nextLine());

        System.out.print("Enter date for Procedure 1: ");
        procedure1.setDate(scanner.nextLine());

        System.out.print("Enter charge for Procedure 1: ");
        procedure1.setCharges(scanner.nextDouble());
        scanner.nextLine(); // Consume newline

        
        // For procedure 2
        System.out.print("\n\nEnter name for Procedure 2: ");
        procedure2.setName(scanner.nextLine());

        System.out.print("Enter practitioner for Procedure 2: ");
        procedure2.setPractitioner(scanner.nextLine());

        System.out.print("Enter date for Procedure 2: ");
        procedure2.setDate(scanner.nextLine());

        System.out.print("Enter charge for Procedure 2: ");
        procedure2.setCharges(scanner.nextDouble());
        scanner.nextLine(); // Consume newline

        
        // Procedure 3
        System.out.print("\n\nEnter name for Procedure 3: ");
        procedure3.setName(scanner.nextLine());

        System.out.print("Enter practitioner for Procedure 3: ");
        procedure3.setPractitioner(scanner.nextLine());

        System.out.print("Enter date for Procedure 3: ");
        procedure3.setDate(scanner.nextLine());

        System.out.print("Enter charge for Procedure 3: ");
        procedure3.setCharges(scanner.nextDouble());
        scanner.nextLine(); // Consume newline

       
        
        
        // Display details
        System.out.println("\n\n");
        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%.2f", totalCharges);
        
        
        
        //finale
        System.out.println("\n" +
        		"Student Name: Jerrison Abrigo" + "\n" +
        		"MC#: 21134020" + "\n" +
        		"Due Date: 02/27/2025");

        scanner.close();
    }

    public static void displayPatient(Patient input) {
        System.out.println(input);
    }

    public static void displayProcedure(Procedure input) {
        System.out.println(input);
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}
