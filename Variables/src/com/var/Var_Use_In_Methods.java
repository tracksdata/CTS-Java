package com.var;

class SomeClass {

	static int sta = 1;
	int ins = 2;

	static void staMethd(SomeClass sc) {
		System.out.println(sta);
		System.out.println(sc.ins);
	}

	void insMethod() {
		System.out.println(sta);
		System.out.println(ins);
	}

}

public class Var_Use_In_Methods {

	public static void main(String[] args) {

		SomeClass obj = new SomeClass();
		// obj.insMethod();
		SomeClass.staMethd(obj);

	}

}
