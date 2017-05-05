package com.multi;

class Office implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		// -----------------------

		if (name.equals("employee")) {
			System.out.println("working >>>>>>>>>");
		}

		// ------------------------

		if (name.equals("trainer")) {

			synchronized (this) {
				// in class room
				System.out.println("training >>>>>>>>>");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("training >>>>>>>>> end");
			}

		}

	}

}

public class Thread_Sync_Block_Ex2 {

	public static void main(String[] args) {

		Office office = new Office();

		Thread thread01 = new Thread(office, "trainer");
		Thread thread02 = new Thread(office, "trainer");
		Thread thread1 = new Thread(office, "employee");
		Thread thread2 = new Thread(office, "employee");

		thread01.start();
		thread02.start();

		thread1.start();
		thread2.start();

	}

}
