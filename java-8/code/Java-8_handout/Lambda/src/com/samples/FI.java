package com.samples;

@FunctionalInterface
public interface FI {

	// must
	void abs();

	// optional

	// default methods
	public default void de() {

	}

	// static methods
	public static void st() {

	}

	public String toString();
	
}



class Abc{
	
	void ins(){
		
	}
	
}