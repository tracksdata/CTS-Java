package com.multi;

import java.time.LocalTime;

/**
 * 
 * @author nag
 *
 *         Causes the currently executing thread to sleep (temporarily cease
 *         execution) for the specified number of milliseconds, subject to the
 *         precision and accuracy of system timers and schedulers. The thread
 *         does not lose ownership of any monitors.
 *
 */

class Timer extends Thread {
	@Override
	public void run() {
		while (true) {
			LocalTime time = LocalTime.now();
			System.out.println(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread_Sleep_Ex {

	public static void main(String[] args) throws InterruptedException {

		// System.out.println("breakfast");
		// Thread.sleep(5000);
		// System.out.println("lunch");

		Timer timer = new Timer();
		timer.start();

	}

}
