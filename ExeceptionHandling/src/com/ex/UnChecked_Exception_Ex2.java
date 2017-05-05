package com.ex;

//--------------------------------------------

class M3 {
	public void method3(String inp) {
		System.out.println("M1:method1()");
		throw new RuntimeException("oops");
	}
}

class M4 {

	public void method4() {

		M3 m3 = new M3();

		m3.method3("inp");

		System.out.println("M2:method2()");

	}
}

// ---------------------------------------------

public class UnChecked_Exception_Ex2 {

	public static void main(String[] args) {

		try {
			M4 m4 = new M4();
			m4.method4();
		} catch (RuntimeException re) {
			System.out.println("handled ex in main..");
			re.printStackTrace();
		}
	}

}
