package co.grandcircus;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {

		// do not include variables for area or circumference here

		Scanner scan = new Scanner(System.in);
		String cont = "";
		String go = "";
		double radius = 0;
		int counter = 0;


		System.out.println("Welcome to the Circle Tester, where we will go round and round...");
		System.out.println("Would you like to find the area and circumference of your circle? (y/n)");
		go = scan.nextLine();

		while ((go.equalsIgnoreCase("yes")) || (go.equalsIgnoreCase("y"))) {
		// prompt the user to enter a radius
			radius = Validator.getDouble(scan, "Enter the radius: ");
		// display an error if the user enters invalid data
		// when the user enters valid data, calculate the area and circumference of the
		// circle and rounds to the nearest 2 decimal places

			Circle circle = new Circle(radius);

			System.out.println(circle);
			// System.out.println("Radius: " + radius);
			counter++;

		// ask if the user wants to continue
			System.out.println("\nDo you want to measure another circle? (y/n)");
		cont = scan.nextLine();
			if ((cont.equalsIgnoreCase("yes")) || (cont.equalsIgnoreCase("y"))) {
				continue;
			} else {
				break;
			}

		}

		// when the user quits, display a "goodbye" message that also indicates the
		// number of circles the user built
		System.out.println("\nYou built the following amount of circles: " + counter);
		System.out.println("Goodbye!");

	}


}
