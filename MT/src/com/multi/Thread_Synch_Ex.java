package com.multi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * synchronization:
 * 
 * Locking resource(obj) for one thread for it's complete operation.
 *
 */

class Box {

	private List<String> items = new ArrayList<>();

	public void addItem(String item) {
		this.items.add(item);
	}

	public List<String> getItems() {
		return this.items;
	}

	public int getCount() {
		return this.items.size();
	}
}

class BoxWork implements Runnable {

	Object mutex = new Object();

	Box box = new Box();
	Scanner sc = new Scanner(System.in);

	public void run() {

		String name = Thread.currentThread().getName();

		if (name.equals("write-1") || name.equals("write-2")) {

			synchronized (this) {

				System.out.println(name + " thread >>>>>");
				System.out.println("Enter Item...");
				String item = sc.nextLine();
				box.addItem(item);
				System.out.println(name + " thread >>>>> end");

			}
		}

		if (name.equals("read")) {
			System.out.println(name + " thread >>>>>");
			List<String> list = box.getItems();
			for (String item : list) {
				System.out.println(item);
			}
			System.out.println(name + " thread >>>>> end");
		}

		if (name.equals("count")) {
			System.out.println(name + " thread >>>>>");
			System.out.println("count-" + box.getCount());
			System.out.println(name + " thread >>>>> end");
		}

	}

}

public class Thread_Synch_Ex {

	public static void main(String[] args) throws InterruptedException {

		BoxWork boxWork = new BoxWork();

		Thread thread11 = new Thread(boxWork, "write-1");
		Thread thread12 = new Thread(boxWork, "write-2");

		Thread thread2 = new Thread(boxWork, "read");
		Thread thread3 = new Thread(boxWork, "count");

		thread11.start();
		Thread.sleep(2000);
		thread12.start();
		Thread.sleep(2000);
		thread2.start();
		Thread.sleep(2000);
		thread3.start();

	}

}
