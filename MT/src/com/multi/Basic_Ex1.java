package com.multi;

import java.lang.*;

/*
 * The Runnable interface should be implemented
 * by any class whose instances are intended to be executed by a thread. 
 * 
 * The class must define a method of no arguments called 'run'.
 * 
 */
class Abc {

}

class Work1 extends Abc implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " hello...");
	}

}

public class Basic_Ex1 {

	public static void main(String[] args) {

		Work1 work1 = new Work1();

		Thread thread = new Thread(work1, "T1");
		thread.start();

		Thread thread2 = new Thread(work1, "T2");
		thread2.start();

		System.out.println(Thread.currentThread().getName() + " with other work..");

	}

}
