import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		// Welcome message.
		System.out.println("Simple Calculator by Magrid0");
		
		// Initialize scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Enter the first number.
		System.out.print("Enter the firt number: ");
		String StringA = scanner.nextLine();
		int a = Integer.parseInt(StringA);
		
		// Enter the second number.
		System.out.print("Enter the second number: ");
		String StringB = scanner.nextLine();
		int b = Integer.parseInt(StringB);
		
		// Choose sum or subtraction.
		System.out.println("Do you want to Sum or Subtract these two numbers?");
		System.out.println("[1] Sum");
		System.out.println("[2] Subtract");
		System.out.println("[3] Multiply");
		System.out.println("[4] Divide");
		String StringChoice = scanner.nextLine();
		int choice = Integer.parseInt(StringChoice);
		
		if (choice == 1) {
			
			// Sum the two numbers.
			int sum = a + b;
			System.out.println(sum);
			
		} else if (choice == 2) {
			
			// Subtract the two numbers.
			int subtract = a - b;
			System.out.println(subtract);
			
		} else if (choice == 3) {
			
			// Multiply the two numbers.
			int multiply = a * b;
			System.out.println(multiply);
			
		} else if (choice == 4) {
			
			// Divide the two numbers.
			int divide = a/b;
			System.out.println(divide);
			
		} else {
			
			// Invalid choice message.
			System.out.println("Invalid choice, select 1 or 2.");
			
		}
		
		
		// Close scanner.
		scanner.close();
		
	}

}