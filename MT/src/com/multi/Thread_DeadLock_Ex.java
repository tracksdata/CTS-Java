package com.multi;

/*
 * 
 * T1  --> R1,  trying for R2
 * T2  --> R2,  trying for R1
 * 
 * 
 */

class R1 {

	public synchronized void m1(R2 r2) {
		System.out.println("T1 using R1");
		System.out.println("T1 also trying for R2");
		r2.m2();
	}

	public synchronized void m2() {
		System.out.println("T2 also having R1");
	}

}

class R2 {
	
	public synchronized void m1(R1 r1) {
		System.out.println("T2 using R2");
		System.out.println("T2 also trying for R1");
		r1.m2();
	}

	public synchronized void m2() {
		System.out.println("T1 also having R2");
	}
}

class DWork implements Runnable {

	R1 r1 = new R1();  // key1
	R2 r2 = new R2();  // key2

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		if (name.equals("T1")) {
			r1.m1(r2);
		}
		if (name.equals("T2")) {
			r2.m1(r1);
		}

	}

}

public class Thread_DeadLock_Ex {

	public static void main(String[] args) throws InterruptedException {

		DWork dWork = new DWork();

		Thread thread1 = new Thread(dWork, "T1");
		Thread thread2 = new Thread(dWork, "T2");

		thread1.start();
		thread2.start();

	}

}
