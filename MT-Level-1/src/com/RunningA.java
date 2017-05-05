package com;

import com.model.A;

public class RunningA {

	public static void main(String[] args) throws InterruptedException {

		A obj = new A();
		
		Runnable r1 = () -> obj.a();
		Runnable r2 = () -> obj.b();
		
		Thread t1 = new Thread(r1,"A");
		t1.start();

		Thread t2 = new Thread(r2,"B");
		t2.start();

		t1.join();
		t2.join();
	}
}
