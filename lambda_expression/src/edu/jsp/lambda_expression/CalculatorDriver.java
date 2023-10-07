package edu.jsp.lambda_expression;

public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator calculator = (a, b) -> {
			System.out.println(a+b);
		};
		
		calculator.divide(50, 10);
	}
}
