package com.intro;

@FunctionalInterface
interface CustomComparator<T> {

	// An abstract method declared in the interface
	int compare(T o1, T o2);

	// Re-declaration of the equals() method in the Object class
	boolean equals(Object obj);

	/* Many static and default methods that are not shown here. */

}

// @FunctionalInterface
interface Operations {
	double add(double n1, double n2);

	double subtract(double n1, double n2);
}

// @FunctionalInterface
class Test {
	// Code goes here
}

@FunctionalInterface
interface I<T> {
	T m(T o1, T o2);
}

@FunctionalInterface
interface II {
	<T> void m(T o1, T o2);
}

@FunctionalInterface
interface Mapper<T> {

	// An abstract method
	int map(T source);

	// A generic static method
	public static <U> int[] mapToInt(U[] list, Mapper<? super U> mapper) {
		int[] mappedValues = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			// Map the object to an int
			mappedValues[i] = mapper.map(list[i]);
		}
		return mappedValues;
	}
}

public class FI_3 {

	public static void main(String[] args) {

		// Map names using their length
		System.out.println("Mapping names to their lengths:");
		String[] names = { "David", "Li", "Doug" };
		int[] lengthMapping = Mapper.mapToInt(names,(String name) -> name.length());
		printMapping(names, lengthMapping);

		System.out.println("\nMapping integers to their squares:");
		Integer[] numbers = { 7, 3, 67 };
		int[] countMapping = Mapper.mapToInt(numbers, (Integer n) -> n * n);
		printMapping(numbers, countMapping);
	}

	public static void printMapping(Object[] from, int[] to) {
		for (int i = 0; i < from.length; i++) {
			System.out.println(from[i] + " mapped to " + to[i]);
		}
	}
}
