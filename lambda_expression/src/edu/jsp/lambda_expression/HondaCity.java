package edu.jsp.lambda_expression;

public class HondaCity {

	public static void main(String[] args) {
		Car car=()->{
			System.out.println("Honda City Started");
		};
		
		car.start();
	}

	
	
}
