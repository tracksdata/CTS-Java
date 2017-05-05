package com.ex;

//--------------------------------------------

class M1 {
	public void method1(String inp) throws Exception {
		System.out.println("M1:method1()");
		throw new Exception();
	}
}

// ---------------------------------------------

class M2 {

	public void method2() {

		M1 m1 = new M1();
		try {
			m1.method1("inp");
		} catch (Exception e) {
			System.out.println("Ex handled by M2 ");
		}

		System.out.println("M2:method2()");

	}
}

// ---------------------------------------------

public class Checked_Exception_Ex1 {

	public static void main(String[] args) {

		M2 m2 = new M2();
		m2.method2();

	}

}
