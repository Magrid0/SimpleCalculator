// Version 2.1

import java.util.Scanner;

class GlobalVariables {
	// Declare global variables.
	public static float a, b;
	public static int choice;
}

class Calculator {

	public static void sum() {

		// Sum the two numbers.
		float sum = GlobalVariables.a + GlobalVariables.b;
		System.out.println("\nThe result is: " + sum);

	}

	public static void subtraction() {

		// Subtract the two numbers.
		float subtract = GlobalVariables.a - GlobalVariables.b;
		System.out.println("\nThe result is: " + subtract);

	}

	public static void multiplication() {

		// Multiply the two numbers.
		float multiply = GlobalVariables.a * GlobalVariables.b;
		System.out.println("\nThe result is: " + multiply);

	}

	public static void division() {

		if (GlobalVariables.b != 0) {
			// Divide the two numbers.
			float divide = GlobalVariables.a / GlobalVariables.b;
			System.out.println("\nThe result is: " + divide);
		} else {
			System.out.println("\nCannot divide by zero.");
		}

	}

	public static void sqrt() {

		// Calculate the square root.
		float sqrt = (float) Math.sqrt(GlobalVariables.a);
		System.out.println("\nThe square root of " + GlobalVariables.a + " is: " + sqrt);
	}

}

class ScientificCalculator {

	public static void trigonometricFunctions() {

		// Convert the variables to radians.
		double radiansA = Math.toRadians(GlobalVariables.a);
		double radiansB = Math.toRadians(GlobalVariables.b);
		
		System.out.println("\nTrigonometric Functions:");

		// Calculate the trigonometric functions of a.
		System.out.println("Sin a(" + GlobalVariables.a + ") = " + Math.sin(radiansA));
		System.out.println("Cos a(" + GlobalVariables.a + ") = " + Math.cos(radiansA));
		System.out.println("Tan a(" + GlobalVariables.a + ") = " + Math.tan(radiansA));

		// Calculate the trigonometric functions of b.
		System.out.println("Sin b(" + GlobalVariables.b + ") = " + Math.sin(radiansB));
		System.out.println("Cos b(" + GlobalVariables.b + ") = " + Math.cos(radiansB));
		System.out.println("Tan b(" + GlobalVariables.b + ") = " + Math.tan(radiansB));

	}

	public static void exponentialFunctions() {
		
		System.out.println("\nExponential Functions:");

		// Calculate the exponential functions of a.
		System.out.println("Exp(" + GlobalVariables.a + ") = " + Math.exp(GlobalVariables.a));

		// Calculate the exponential functions of b.
		System.out.println("Exp(" + GlobalVariables.b + ") = " + Math.exp(GlobalVariables.b));

		// Calculate the exponential functions of a and b.
		System.out.println("Pow(" + GlobalVariables.a + ", " + GlobalVariables.b + ") = " + Math.pow(GlobalVariables.a, GlobalVariables.b));

	}

	public static void logarithmicFunctions() {
		
		System.out.println("\nLogarithmic Functions:");

		// Calculate the logarithmic functions of a.
		System.out.println("Log(" + GlobalVariables.a + ") = " + Math.log(GlobalVariables.a));

		// Calculate the logarithmic functions of b.
		System.out.println("Log(" + GlobalVariables.b + ") = " + Math.log(GlobalVariables.b));

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
			System.out.print("\nEnter the first number: ");
			GlobalVariables.a = Integer.parseInt(scanner.nextLine());

			// Enter the second number.
			System.out.print("\nEnter the second number (insert 0 for square root): ");
			GlobalVariables.b = Integer.parseInt(scanner.nextLine());

			// Choose operation.
			System.out.println("[1] Sum");
			System.out.println("[2] Subtract");
			System.out.println("[3] Multiply");
			System.out.println("[4] Divide");
			System.out.println("[5] Square root");
			System.out.println("[6] Trigonometric Functions");
			System.out.println("[7] Exponential Functions");
			System.out.println("[8] Logarithmic Functions");
			System.out.println("[9] Exit");
			System.out.print("Select an operation: ");
			GlobalVariables.choice = Integer.parseInt(scanner.nextLine());

			// Validate the user's choice.
			while (GlobalVariables.choice < 1 || GlobalVariables.choice > 10) {
				System.out.println("Invalid choice. Please enter a valid choice (1-10).");
				GlobalVariables.choice = Integer.parseInt(scanner.nextLine());
			}

			// Validate the second number for division operation.
			if (GlobalVariables.choice == 4 && GlobalVariables.b == 0) {
				System.out.println("Cannot divide by zero. Please enter a non-zero value.");
				continue;
			}

			switch (GlobalVariables.choice) {

				case 1 -> Calculator.sum();

				case 2 -> Calculator.subtraction();

				case 3 -> Calculator.multiplication();

				case 4 -> Calculator.division();

				case 5 -> Calculator.sqrt();

				case 6 -> ScientificCalculator.trigonometricFunctions();

				case 7 -> ScientificCalculator.exponentialFunctions();

				case 8 -> ScientificCalculator.logarithmicFunctions();

				case 9 -> exit = true;

				default -> System.out.println("Invalid choice");

			}

		}
		
		// Close scanner.
		scanner.close();
		
	}

}
