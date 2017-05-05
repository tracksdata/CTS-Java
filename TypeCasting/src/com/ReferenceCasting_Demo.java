package com;

abstract class V {

}

class C extends V {

}

class B extends V {

}

public class ReferenceCasting_Demo {

	public static void main(String[] args) {

		// C c=new C();
		// B b=new B();

		// V v=new C(); // implicit
		// v=new B();

		V v = new B();

		// if (v instanceof C) {
		C c = (C) v;
		System.out.println("happy casting....");
		// }else{
		// System.out.println("cant cast...");
		// }

	}

}
