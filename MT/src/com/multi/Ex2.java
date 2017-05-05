package com.multi;

class Work2 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " working...");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		Work2 work2 = new Work2();
		work2.start();

		// Thread thread = new Thread(work2, "T1");
		// thread.start();

	}

}
