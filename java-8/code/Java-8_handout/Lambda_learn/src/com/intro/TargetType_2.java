package com.intro;

import java.util.ArrayList;

@FunctionalInterface
interface Adder {
	double add(double n1, double n2);
}

@FunctionalInterface
interface Joiner {
	String join(String s1, String s2);
}

public class TargetType_2 {

	public static void main(String[] args) {

		// -------------------------------------------------

		// Stand-alone expr
		// String s = "Hello";
		// ArrayList<String> nameList = new ArrayList<String>();

		
		// Poly expressions

		// ArrayList<Long> idList = new ArrayList<>();
		// nameList = new ArrayList<>();

		// --------------------------------------------------

		// Creates an Adder using a lambda expression
		Adder adder = (x, y) -> x + y;

		// Creates a Joiner using a lambda expression
		Joiner joiner = (x, y) -> x + y;

		// Adds two doubles
		double sum1 = adder.add(10.34, 89.11);
		// Adds two ints
		double sum2 = adder.add(10, 89);
		// Joins two strings
		String str = joiner.join("Hello", " lambda");

		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("str = " + str);

		// -------------------------------------------------

		LambdaUtil util = new LambdaUtil();
		// Call the testAdder() method
		util.testAdder((x, y) -> x + y);

		// Call the testJoiner() method
		util.testJoiner((x, y) -> x + y);

		// Call the testJoiner() method. The Joiner will
		// add a space between the two strings
		util.testJoiner((x, y) -> x + " " + y);

		// Call the testJoiner() method. The Joiner will
		// reverse the strings and join resulting strings in
		// reverse order adding a comma in between
		util.testJoiner((x, y) -> {
			StringBuilder sbx = new StringBuilder(x);
			StringBuilder sby = new StringBuilder(y);
			sby.reverse().append(",").append(sbx.reverse());
			return sby.toString();
		});

		// ---------------------------------------------------------

		LambdaUtil2 util2 = new LambdaUtil2();
		// util2.test((x, y) -> x + y); // compile error
		util2.test((double x, double y) -> x + y); // explicit expression
		util2.test((Joiner) (x, y) -> x + y); // casting

		// Assign lambda and pass
		Adder a = (x, y) -> x + y;
		util2.test(a);
		
		//--------------------------------------------------------------
		
		

	}
}

class LambdaUtil {

	public void testAdder(Adder adder) {
		double x = 190.90;
		double y = 8.50;
		double sum = adder.add(x, y);
		System.out.print("Using an Adder:");
		System.out.println(x + " + " + y + " = " + sum);
	}

	public void testJoiner(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = joiner.join(s1, s2);
		System.out.print("Using a Joiner:");
		System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");
	}

}

class LambdaUtil2 {

	public void test(Adder adder) {
		double x = 190.90;
		double y = 8.50;
		double sum = adder.add(x, y);
		System.out.print("Using an Adder:");
		System.out.println(x + " + " + y + " = " + sum);
	}

	public void test(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = joiner.join(s1, s2);
		System.out.print("Using a Joiner:");
		System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");
	}

}
