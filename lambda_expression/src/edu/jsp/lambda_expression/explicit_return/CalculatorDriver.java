package edu.jsp.lambda_expression.explicit_return;

public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator calculator = (a, b) -> {
			if (b > 0) {
				return a / b;
			} else {
				return 0;
			}
		};

		System.out.println(calculator.divide(50, 10));
	}
}
