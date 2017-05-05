package com.samples;

interface Int {
	void m();
}

public class LamdaContext {

	public static void main(String[] args) {

		// 1. assigment context

		Int ex = () -> {
		};

		abc(() -> {
		});

		Int ex2 = xyz();

	}

	private static Int xyz() {
		// TODO Auto-generated method stub
		return () -> {
		};
	}

	private static void abc(Int i) {
		// TODO Auto-generated method stub

	}

}
