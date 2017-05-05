package com;

class Computer implements Runnable {

	boolean isReady = false;

	@Override
	public void run() {

		if (!isReady) {
			synchronized (this) {
				try {
					System.out.println("waiting for computer shud get ready..");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("using computer...");

	}

}

public class Producer_Consumer_Ex {

	public static void main(String[] args) throws InterruptedException {

		Computer computer = new Computer();

		Thread empThread = new Thread(computer);
		empThread.start();

		Thread.sleep(5000);

		computer.isReady = true;
		synchronized (computer) {
			computer.notify();
		}

		Thread empThread2 = new Thread(computer);
		empThread2.start();

	}

}
