package com;

public class Semaphore_Ex {

	static volatile Object data = null;

	static Object full = new Object();
	static Object empty = new Object();
	
	

	public static synchronized void push(Object d) throws InterruptedException {

		// while (data != null) {
		// }

		synchronized (full) {
			if (data != null)
				full.wait();
		}

		data = d;

		synchronized (empty) {
			if (data != null) {
				empty.notify();
			}
		}
		
		

	}

	public static Object pop() throws InterruptedException {

		// while (data == null) {
		// }

		synchronized (empty) {
			if (data == null)
				empty.wait();
		}

		Object d = data;
		data = null;

		synchronized (full) {
			if (data == null) {
				full.notify();
			}
		}

		return d;
	}

	static class Producer implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {

					Thread.sleep(2000);

					Object o = createNewObject();
					push(o); //
					System.out.println("produced..");

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		private Object createNewObject() {
			return new Object();
		}
	}

	static class Consumer implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(3000);

					Object o = pop();
					doSomething(o);
					System.out.println("consumed..");

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		private void doSomething(Object o) {
			//
		}
	}

	public static void main(String[] args) {

		new Thread(new Producer()).start();
		new Thread(new Consumer()).start();

	}

}
