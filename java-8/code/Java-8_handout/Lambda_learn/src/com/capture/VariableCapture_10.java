package com.capture;

interface Printer {
	void print(String input);
}

public class VariableCapture_10 {

	public static void main(String[] args) {

		// final String msg= "Hello"; // msg is effectively final
		// msg="Hello again";
		// Printer printer = inputMessage -> System.out.println(msg+ " " +
		// inputMessage);

		// ---------------------------------------------------------------------

		// String msg= "Hello"; // msg is effectively final
		// Printer printer = msg1 -> System.out.println(msg+ " " + msg1);

		// ---------------------------------------------------------------------

		// msg is not effectively final as it is changed later
		String msg = "Hello";
		// A compile-time error as a lambda expression can access only
		// effectively final local variables and the msg variable is not
		// effectively final as it is changed afterwards.

		Printer printer = input -> System.out.println(msg + " " + input);
		// msg= "Hi"; // msg is changed

		// ---------------------------------------------------------------------

	}

}
