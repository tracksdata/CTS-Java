package com.mr;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

interface EmployeeFI {
	Employee create(int id, String name, double salary);

	default void abc(int id, String name, double salary) {
		System.out.println("Abc...");
	}

}

class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class Sample {

	public static void main(String[] args) {

		// Supplier<String> f1=()->new String();
		// Supplier<String> f1 = String::new;

		// System.out.println(f1.get());

		// Function<String, String> f2=(str)->new String(str);
		Function<String, String> f2 = String::new;
		System.out.println(f2.apply("abc"));

		EmployeeFI employeeFI = (x, y, z) -> new Employee(x, y, z);
		EmployeeFI employeeFI2 = Employee::new;
		Supplier<Employee> newEmp = Employee::new;

		Employee e = employeeFI2.create(1123, "Naga", 1000.00);
		
		//----------------------------------------------------------
		
		Function<Integer, int[]> newArray=(size)->new int[size];
		Function<Integer, int[]> newArray2=int[]::new;
		
		
		int[] a=newArray.apply(100);
		
		
		
		

	}

}
