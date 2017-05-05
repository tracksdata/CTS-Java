
// package
package com.cts.emp;

//import statements
import java.lang.*;

// public type
public class Employee {

	// 1.variables

	// a. class variables
	public static final String COMP_NAME = "CTS";
	public static String tnrName;

	// b. obj/instance variables
	public int id;
	public String name;
	public double salary;

	// 2. constructor

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 3. methods

	// a. class methods

	public static void doTeach() {
		System.out.println("Employee:doTeach()..");
	}

	// b. obj/instance methods

	public void doListen() {
		System.out.println("emp:doListen()");
	}

}

// default type
class Abc {

}
