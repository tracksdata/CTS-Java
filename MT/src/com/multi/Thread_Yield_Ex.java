package com.multi;

/**
 * 
 * 
 * @author nag
 *
 *         A hint to the scheduler that the current thread is willing to yield
 *         its current use of a processor. The scheduler is free to ignore this
 *         hint.
 *
 */

class SomeWork implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "-->" + i);
			if (i == 5) {
				Thread.yield();
			}
		}
	}
}

public class Thread_Yield_Ex {

	public static void main(String[] args) {
		SomeWork someWork = new SomeWork();
		Thread thread1 = new Thread(someWork, "A");
		Thread thread2 = new Thread(someWork, "B");

		thread1.start();
		thread2.start();
	}

}
