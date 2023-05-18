import java.util.Scanner;

class GlobalVariables {
	public static int a, b; // Declare global variables.
}

class Calculator {

	public static void sum() {

		// Sum the two numbers.
		int sum = GlobalVariables.a + GlobalVariables.b;
		System.out.println("\nThe result is: " + sum);

	}

	public static void subtraction() {

		// Subtract the two numbers.
		int subtract = GlobalVariables.a - GlobalVariables.b;
		System.out.println("\nThe result is: " + subtract);

	}

	public static void multiplication() {

		// Multiply the two numbers.
		int multiply = GlobalVariables.a * GlobalVariables.b;
		System.out.println("\nThe result is: " + multiply);

	}

	public static void division() {

		if (GlobalVariables.b != 0) {
			// Divide the two numbers.
			int divide = GlobalVariables.a / GlobalVariables.b;
			System.out.println("\nThe result is: " + divide);
		} else {
			System.out.println("\nCannot divide by zero.");
		}

	}

}

public class SimpleCalculator {

	public static void main(String[] args) {
		
		// Welcome message.
		System.out.println("Simple Calculator by Magrid0\n");
		
		// Initialize scanner.
		Scanner scanner = new Scanner(System.in);

		boolean exit = false; // Declare exit variable.

		while (!exit) {

			// Enter the first number.
			System.out.print("Enter the first number: ");
			GlobalVariables.a = Integer.parseInt(scanner.nextLine());

			// Enter the second number.
			System.out.print("Enter the second number: ");
			GlobalVariables.b = Integer.parseInt(scanner.nextLine());

			// Choose sum or subtraction.
			System.out.println("Do you want to Sum or Subtract these two numbers?");
			System.out.println("[1] Sum");
			System.out.println("[2] Subtract");
			System.out.println("[3] Multiply");
			System.out.println("[4] Divide");
			System.out.println("[5] Exit");
			int choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {

				case 1 -> Calculator.sum();

				case 2 -> Calculator.subtraction();

				case 3 -> Calculator.multiplication();

				case 4 -> Calculator.division();

				case 5 -> exit = true;

				default -> System.out.println("Invalid choice");

			}

		}
		
		// Close scanner.
		scanner.close();
		
	}

}
