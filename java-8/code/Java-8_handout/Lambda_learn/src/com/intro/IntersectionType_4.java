package com.intro;

interface Sensitive {
	// It is marker Interface
}

public class IntersectionType_4 {

	public static void main(String[] args) {

		// Sensitive sen = (x, y) -> x + y; // compile error

		Sensitive sen = (Sensitive & Adder) (x, y) -> x + y; // Intersection
		Adder a=(Adder)sen;
		System.out.println(a.add(12, 12));

	}

}
