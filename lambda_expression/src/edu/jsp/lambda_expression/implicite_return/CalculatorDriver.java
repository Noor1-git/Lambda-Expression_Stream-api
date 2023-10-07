package edu.jsp.lambda_expression.implicite_return;

public class CalculatorDriver {

	public static void main(String[] args) {
		
//		without method block can only have one statement i.e. return statement
		Calculator calculator = (a, b) -> a/b;
		
		System.out.println(calculator.divide(50, 10));
	}
}
