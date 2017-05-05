package com.samples;

import java.util.ArrayList;
import java.util.List;

interface FII {
	int sum(int x, int y);
}

public class Lambda_Param_Type {

	public static void main(String[] args) {

		FII fi = (int x, int y) -> x + y;
		
		//----------------------------------------------
		
		String s="hello";  // stand-alone exp
		
		ArrayList<?> list=new ArrayList<>(); // poly exp
		
		ArrayList<String> strList=new ArrayList<>();  // Automatic Type inoccurance
		ArrayList<Integer> intList=new ArrayList<>();;
		
		

	}

}
