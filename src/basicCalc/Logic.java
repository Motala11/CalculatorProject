package basicCalc;

public class Logic {
		private final Calc calc = new Calc();
		
		public String calculate(double num1, double num2, char operator) {
			switch (operator) {
			case '+':
				return "Result = " + calc.add(num1, num2);
			case '-':
				return "Result = " + calc.subtract(num1, num2);
			case '*':
				return "Result = " + calc.multiply(num1, num2);
			case '/':
				if (num2 != 0) {
					return "Result = " + calc.divide(num1, num2);
				} else {
					return "Error! Division by zero is not allowed.";
			}
	}
			return "Error: Invalid operator!";
		
}
}