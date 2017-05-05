package com.scope;

@FunctionalInterface
interface Printer {
	void print(String msg);
}

public class ScopeTest_9 {

	public static void main(String[] args) {

		ScopeTest_9 test = new ScopeTest_9();

		// Printer lambdaPrinter = test.getLambdaPrinter();
		// lambdaPrinter.print("Lambda Expressions");

		Printer anonymousPrinter = test.getAnonymousPrinter();
		anonymousPrinter.print("Anonymous Class");

		// -----------------------------------------------

		String msg = "Hello";
		// A compile-time error. The msg variable is already defined and
		// the lambda parameter is attempting to redefine it.
		// Printer printer =(msg)-> System.out.println(msg);

		Printer printer2 = msg1 -> {
			// String msg= "Hi"; // A compile-time error
			System.out.println(msg);
		};

	}

	public Printer getLambdaPrinter() {
		System.out.println("getLambdaPrinter(): " + this.getClass());
		// Uses a lmabda expression
		Printer printer = msg -> {
			// Here, this refers to the current object of the
			// ScopeTest class
			System.out.println(msg + ": " + this.getClass());
		};
		return printer;
	}

	public Printer getAnonymousPrinter() {
		System.out.println("getAnonymousPrinter(): " + this.getClass());
		// Uses an anonymous class
		Printer printer = new Printer() {
			@Override
			public void print(String msg) {
				// Here, this refers to the current object of the
				// anonymous class
				System.out.println(msg + ": " + this.getClass());
			}
		};
		return printer;
	}

}
