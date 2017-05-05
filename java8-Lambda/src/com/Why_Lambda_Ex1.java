package com;

public class Why_Lambda_Ex1 {

	public static void main(String[] args) {

		// Thread thread1 = new Thread(new Runnable() {
		// @Override
		// public void run() {
		// System.out.println("Task-1");
		// }
		// });
		// Thread thread2 = new Thread(new Runnable() {
		// @Override
		// public void run() {
		// System.out.println("Task-2");
		// }
		// });
		//

		Thread thread = new Thread(() -> {
			System.out.println("Task-1");
		});
		Thread thread2 = new Thread(() -> {
			System.out.println("Task-2");
		});

	}

}
