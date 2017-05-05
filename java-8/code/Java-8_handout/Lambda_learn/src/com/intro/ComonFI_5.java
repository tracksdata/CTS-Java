package com.intro;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class ComonFI_5 {

	public static void main(String[] args) {

		// Takes an int and returns its square

		Function<Integer, Integer> sq1 = x -> x * x;
		IntFunction<Integer> sq2 = x -> x * x;
		ToIntFunction<Integer> sq3 = x -> x * x;
		UnaryOperator<Integer> sq4 = x -> x * x;
		
		
		System.out.println(sq1.apply(5));
		System.out.println(sq2.apply(5));
		System.out.println(sq3.applyAsInt(5));
		System.out.println(sq4.apply(5));
		
		//----------------------------------------------
		
		// Create two functions
		Function<Long, Long> square = x -> x * x;
		Function<Long, Long> addOne = x -> x + 1; 
		
		// Compose functions from the two functions
		Function<Long, Long> squareAddOne = square.andThen(addOne);
		Function<Long, Long> addOneSquare = square.compose(addOne);
		
		// Test the functions
		long num = 5L;
		System.out.println("Number : " + num);
		System.out.println("Square and then add one: " + squareAddOne.apply(num));
		System.out.println("Add one and then square: " + addOneSquare.apply(num));
		
		//-----------------------------------------------------------------------------
		
		
		// Square the input, add one to the result, and square the result
		Function<Long, Long> chainedFunction = ((Function<Long, Long>)(x -> x * x))
		.andThen(x -> x + 1)
		.andThen(x -> x * x);
		System.out.println(chainedFunction.apply(3L));
		
//		----------------------------------------------------------------------------------

	}

}
