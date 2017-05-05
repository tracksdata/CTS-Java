package synchronizer;

import java.util.concurrent.Semaphore;

class Queue {
	int value;

	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);

	void get() {
		try {
			semCon.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		System.out.println("Got: " + value);
		semProd.release();
	}

	void put(int n) {
		try {
			semProd.acquire();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}

		this.value = n;
		System.out.println("Put: " + n);
		semCon.release();
	}
}

class Producer implements Runnable {

	Queue q;

	Producer(Queue q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		for (int i = 0; i < 20; i++)
			q.put(i);
	}
}

class Consumer implements Runnable {

	Queue q;

	Consumer(Queue q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		for (int i = 0; i < 20; i++)
			q.get();
	}
}

public class Semaphore_Ex2 {
	public static void main(String args[]) {
		Queue q = new Queue();
		new Consumer(q);
		new Producer(q);
	}
}
