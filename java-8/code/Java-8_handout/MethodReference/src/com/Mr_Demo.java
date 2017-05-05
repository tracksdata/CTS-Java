package com;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Mr_Demo {

	public static void main(String[] args) {

		// By Lambda

		// ToIntFunction<String> lenFunc = (String s) -> s.length();
		// System.out.println(lenFunc.applyAsInt("Naga"));
		//
		// // by MR
		//
		// ToIntFunction<String> newLenFunc = String::length;
		// System.out.println(newLenFunc.applyAsInt("Abc"));

		// ----------------------------------------------------------

		// TypeName::staticMethod

		ToIntFunction<String> parser = Integer::parseInt;

		System.out.println(parser.applyAsInt("1234"));

		// --------------------------------------------------------------

		// TypeName::instanceMethod
	
		ToIntFunction<String> len=String::length;
		
		System.out.println(len.applyAsInt("Abc"));
		
		//--------------------------------------------------------------
		
		String s="naga";
		
		// lambda
		Supplier<Integer> supplier=()->s.length();
		// MR
		supplier=s::length;
		
		
		//---------------------------------------------------
		
		
		String str="Abc";
		
		Supplier<Integer> ss=()->str.length();
		Supplier<Integer> ss2=str::length;
		
		//-----------------------------------
		
		Function<String,Integer> ss3=(anyString)->anyString.length();
		Function<String, Integer> ss4=String::length;
		
		
		//---------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
