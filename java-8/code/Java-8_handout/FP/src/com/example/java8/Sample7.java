package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class Sample7 {

	public static int doubleIt(int number) {
		try{Thread.sleep(1000);}catch(Exception e){}
		return number*2;
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(
				numbers.parallelStream()
				.mapToInt(Sample7::doubleIt)
				.sum()
				);
		
	}

}
