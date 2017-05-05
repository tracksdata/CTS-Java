package com.capture;

interface Learn{
	void doLean();
}

public class ClosureDemo {

	public static void main(String[] args) {

		Learn learn=new ClosureDemo().doTrain("Java-8");
		
		learn.doLean();
		learn.doLean();
		learn.doLean();
		
	}

	
	public  Learn doTrain(String sub) {
		return () -> {System.out.println("Learning...." + sub);};
	}

}
