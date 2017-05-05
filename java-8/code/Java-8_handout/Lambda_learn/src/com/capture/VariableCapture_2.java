package com.capture;

public class VariableCapture_2 {

	private int counter = 0;

	public static void main(String[] args) {
		
		VariableCapture_2 vc1 = new VariableCapture_2();
		
		VariableCapture_2 vc2 = new VariableCapture_2();
		
		// Create lambdas
		Printer p1 = vc1.createLambda(1);
		Printer p2 = vc2.createLambda(100);
		
		// Execute the lambda bodies
		p1.print("Lambda #1");
		p2.print("Lambda #2");
		p1.print("Lambda #1");
		p2.print("Lambda #2");
		p1.print("Lambda #1");
		p2.print("Lambda #2");
	}

	public Printer createLambda(int incrementBy) {
		Printer printer = msg -> {
			// Accesses instance and local variables
			counter += incrementBy;
			System.out.println(msg + ": counter = " + counter);
		};
		return printer;
	}

}
