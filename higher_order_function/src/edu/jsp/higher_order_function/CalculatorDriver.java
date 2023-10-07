package edu.jsp.higher_order_function;

public class CalculatorDriver {

	public static void main(String[] args) {
		Printer printer=new Printer();
		
		printer.print((a,b)->a*b);
	}
	
}
