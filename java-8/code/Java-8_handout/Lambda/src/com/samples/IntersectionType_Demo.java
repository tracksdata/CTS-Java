package com.samples;

import java.io.Serializable;

interface Sensible {

}

interface I {
	void m();
}

public class IntersectionType_Demo {

	public static void main(String[] args) {

		Serializable s=(I&Serializable&Sensible)()->{};
		
		seriallize(s);
		
	}

	private static void seriallize(Serializable s) {
		
	}

}
