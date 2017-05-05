package demo;

import java.util.Comparator;

//interface A {
//	int VALUE = 12;
//
//	void a();
//}
//
//interface B {
//	void b();
//}
//
//interface C extends A,B{
//	
//}

//class P implements C {
//	public void a() {
//
//	}
//
//	public void b() {
//
//	}
//}

//--------------------------------

//interface D{
//	
//}
//interface E{
//	
//}
//
//class Q implements D,E{
//	
//}

//----------------------------------

// JDK 1.8

interface Old {
	void a();

	void b();

	public default void c() {
		System.out.println("Old-default c()");
	}
}

interface New {
	public default void c() {
		System.out.println("New-default c()");
	}
}

class Impl1 implements Old {
	public void a() {
	}

	public void b() {
	}

	@Override
	public void c() {
		System.out.println("Impl1 c()");
	}
}

class Impl2 implements Old, New {
	public void a() {
	}

	public void b() {
	}

	@Override
	public void c() {
		New.super.c();
		System.out.println("Impl2 c()");
	}
}

// ---------------------------------

interface NewInterface {
	public static void m() {
		System.out.println("static method....");
	}
}

class SomeClass implements NewInterface {

	// @Override
	public static void m() {
		System.out.println("static method....");
	}
}

// --------------------------------------

interface One {
	default void a() {
	}
}

interface Two {
	default void a() {
	}
}

class Abc implements One, Two {

	public void a() {
		Two.super.a();
	}
}

public class Demo {

	public static void main(String[] args) {
		Impl1 one = new Impl1();
		one.c();

		NewInterface.m();

	}

}
