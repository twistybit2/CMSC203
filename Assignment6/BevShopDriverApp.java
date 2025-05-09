package Assignment6;

import java.util.*;

public class BevShopDriverApp {
	public static void main(String[] args) {
		
		BevShop paneraBread = new BevShop();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Max alcohols per order: "+ paneraBread.getMaxOrderForAlcohol());
		System.out.println("Min age to order alcohol: " + paneraBread.getMinAgeForAlcohol());
		
		//order
		System.out.println("\nWITNESS THE BIRTH OF A NEW ORDER");
		System.out.print("Enter order time (8 - 23): ");
        int time = scanner.nextInt();
        while (!paneraBread.isValidTime(time)) {
            System.out.print("Invalid time. Enter order time (8 - 23): ");
            time = scanner.nextInt();
        }
		
        System.out.print("Enter day (e.g. MONDAY): ");
        Day day = Day.valueOf(scanner.next().toUpperCase());

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        paneraBread.startNewOrder(time, day, name, age);

        if (paneraBread.isValidAge(age)) {
            System.out.println("Your age is above "+ paneraBread.getMinAgeForAlcohol() +" and you are eligible to order alcohol");

            // Alcohol ordering loop
            while (paneraBread.isEligibleForMore()) {
                System.out.println("Would you like to add an alcohol drink? (yes/no): ");
                if (!scanner.next().equalsIgnoreCase("yes")) break;

                paneraBread.processAlcoholOrder("Isopropyl Alcohol 90%", Size.SMALL);
                System.out.println("Current number of drinks: " + paneraBread.getCurrentOrder().getBeverages().size());
                System.out.println("Total Price: " + paneraBread.getCurrentOrder().calcOrderTotal());
            }

            if (!paneraBread.isEligibleForMore()) {
                System.out.println("You have a maximum alcohol drinks for this order.");
            }
        } else {
            System.out.println("Your Age is not appropriate for alcohol drink!!");
        }

        // Add a coffee
        System.out.println("Would you like to add a COFFEE to your order? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            paneraBread.processCoffeeOrder("Latte", Size.MEDIUM, true, true);
            System.out.println("Total items on your order: " + paneraBread.getCurrentOrder().getBeverages().size());
            System.out.println("Total Price: " + paneraBread.getCurrentOrder().calcOrderTotal());
        }
        

        System.out.println("\nStart a new order:");
        System.out.print("Enter order time (8 - 23): ");
        time = scanner.nextInt();
        while (!paneraBread.isValidTime(time)) {
            System.out.print("Invalid time. Enter order time (8 - 23): ");
            time = scanner.nextInt();
        }

        System.out.print("Enter day (e.g. TUESDAY): ");
        day = Day.valueOf(scanner.next().toUpperCase());

        System.out.print("Enter your name: ");
        name = scanner.next();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        paneraBread.startNewOrder(time, day, name, age);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Would you like to add a SMOOTHIE to your order? (yes/no): ");
            if (scanner.next().equalsIgnoreCase("yes")) {
                System.out.print("Enter number of fruits (0-5): ");
                int fruits = scanner.nextInt();
                if (paneraBread.isMaxFruit(fruits)) {
                    System.out.println("You reached a Maximum number of fruits.");
                }

                System.out.print("Add protein? (true/false): ");
                boolean protein = scanner.nextBoolean();
                paneraBread.processSmoothieOrder("Smoothie" + i, Size.MEDIUM, fruits, protein);
                System.out.println("Total Price: " + paneraBread.getCurrentOrder().calcOrderTotal());
            }
        }
        System.out.println("Would you like to add a COFFEE to your order? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            paneraBread.processCoffeeOrder("Espresso", Size.SMALL, false, false);
            System.out.println("Total Price: " + paneraBread.getCurrentOrder().calcOrderTotal());
        }

 
        System.out.println("Would you like to add an alcohol drink? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            if (!paneraBread.isValidAge(age)) {
                System.out.println("Your Age is not appropriate for alcohol drink!!");
            } else {
                paneraBread.processAlcoholOrder("Beer", Size.SMALL);
            }
        }

        System.out.println("Total items in order: " + paneraBread.getCurrentOrder().getBeverages().size());
        System.out.println("Total price on the second Order: " + paneraBread.getCurrentOrder().calcOrderTotal());
        System.out.println("Total amount for all Orders: " + paneraBread.totalMonthlySale());

        scanner.close();
		
		
	}

}
