package com.samples;

@FunctionalInterface
interface Adder {
	double add(double n1, double n2);
}

interface Joiner {
	String join(String s1, String s2);
}

public class BasicLambda_learn {

	public static void main(String[] args) {

		// Adder adder=(x,y)->x+y; // implicit
		// Adder adder = (double x, double y) -> x + y; // explicit
		// Joiner joiner = (x, y) -> x + y;

		LambdaUtil lambdaUtil = new LambdaUtil();
		lambdaUtil.testAdder((x, y) -> x + y);
		lambdaUtil.testJoiner((x, y) -> x + y);

		lambdaUtil.testJoiner((x, y) -> {
			String s = x + " " + y;
			return s;
		});
		
		
		LambdaUtil2 lambdaUtil2=new LambdaUtil2();
		lambdaUtil2.test((Adder)(x, y)->x+y);

	}

}

class LambdaUtil {

	public void testAdder(Adder adder) {

		double a = 12.00;
		double b = 12.00;

		double sum = adder.add(a, b);
		System.out.println("Using an Adder");
		System.out.println(sum);

	}

	public void testJoiner(Joiner joiner) {

		String a = "hello";
		String b = "world";

		String s = joiner.join(a, b);
		System.out.println("Using an Joiner");
		System.out.println(s);

	}

}

class LambdaUtil2 {

	public void test(Adder adder) {

		double a = 12.00;
		double b = 12.00;

		double sum = adder.add(a, b);
		System.out.println("Using an Adder");
		System.out.println(sum);

	}

	public void test(Joiner joiner) {

		String a = "hello";
		String b = "world";

		String s = joiner.join(a, b);
		System.out.println("Using an Joiner");
		System.out.println(s);

	}

}
