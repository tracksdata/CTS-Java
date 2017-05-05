package com;

import java.util.Date;

class Person {
	String name;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

public class ToString_Ex {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		Person person = new Person();
		person.name = "Nag";

		System.out.println(person.toString());

		// -------------------------------------

		int pri = 123;

		String s = String.valueOf(pri);

		// -----------------------------------

	}

}
