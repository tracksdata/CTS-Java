package com.var;

class Abc {

	static String factory = null;
	int ins = 100;

	static {
		// System.out.println("Abc static block... ");
		// read configuration..
		factory = "some factory";
	}

	{
		System.out.println("Instance Initializer block... ");
		// System.out.println(this.ins);
		//this.ins = 200;
		m();
	}

	public Abc() {
		// this(12);
		if (this.ins > 100) {
			System.out.println("do something...");
		}
		System.out.println("Abc()");
	}

	public Abc(int arg1) {
		System.out.println("Abc(arg1)");
	}

	public Abc(int arg, int agr2) {
		System.out.println("Abc(arg1,arg2)");
	}
	
	public final void m() {
		System.out.println("m()");
	}

}

public class Block_Ex {

	public static void main(String[] args) {

		Abc abc = new Abc();

	}

}
