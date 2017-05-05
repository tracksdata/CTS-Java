package com.example.java8;

import java.util.stream.IntStream;


/*
 *  FP
 *  ------
 *  
 * 
 *  --> code is more expressive
 *  --> declarative
 *  --> easy to communicate
 *  
 *  //------------------------------
 *  
 *  
 *  
 * 
 * 
 */

public class Sample1 {

	public static void main(String[] args) {

		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));

	}

	private static boolean isPrime(final int number) {
		
		// imperative - saying how
		// mutability
		
		// for (int i = 2; i < number; i++) {
		// if (number % i == 0)
		// return false;
		// }
		// return number > 1;

		// Declarative
		// what
		// immutability
		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						index -> number % index == 0);

	}

}
