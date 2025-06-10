package basicCalc;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		Logic logic = new Logic();
		
		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		
		if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
		System.out.println("Error: Invalid operator!");
		} else {
		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();
		
		String result = logic.calculate(num1, num2, operator);
		System.out.println(result);
	
		scanner.close();
		}
	}
}
