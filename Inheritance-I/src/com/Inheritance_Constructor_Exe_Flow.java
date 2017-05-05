package com;

class A {
	public A(int arg1) {
		super();
		System.out.println("Im A");
	}
}

class B extends A {
	public B(int arg1) {
		super(arg1);
		System.out.println("Im B");
	}
}

class C extends B {
	public C(int arg1) {
		super(arg1);
		System.out.println("Im C");
	}
}

public class Inheritance_Constructor_Exe_Flow {

	public static void main(String[] args) {

		C c = new C(123);

	}

}
