package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class Sample3 {

	
	public static boolean isGreaterThan3(int number){
		return number>3;
	}
	public static boolean isEven(int number){
		return number%2==0;
	}
	
	public static void main(String[] args) {
		
		
		// find the double of the first even number greater than 3
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		int result=0;
//		
//		for(int e:values){
//			if(e>3&&e%2==0){
//				result=e*2;
//				break;
//			}
//		}
//		
//		System.out.println(result);
		
		//----------------------------------------------
		
//		System.out.println(
//				values.stream()
//				.filter(e->e>3)
//				.filter(e->e%2==0)
//				.map(e->e*2)
//				.findFirst()
//				);
		
		
		System.out.println(
				values.stream()
				.filter(Sample3::isGreaterThan3)
				.filter(Sample3::isEven)
				.map(e->e*2)
				.findFirst()
				);
		
		
		//-------------------------------------------------------
		
		
	}
}
