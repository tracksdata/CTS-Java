package com.multi;

class Game implements Runnable {
	public void run() {
	};
}

class Player extends Thread {
	public void run() {
	};
}

class BaseLogic{

}

class Logic extends BaseLogic implements Runnable {
	public void run() {
		System.out.println("logic...");
	}
}

// ---------------------------

class TaskRunner extends Thread {

	@Override
	public void run() {

	}
}

public class Thread_Runnable_Ex {
	public static void main(String[] args) {

		Logic logic = new Logic();

		Thread thread1 = new Thread(logic);
		Thread thread2 = new Thread(logic);

		// --------------------------------

		TaskRunner task1 = new TaskRunner();
		task1.start();

		// --------------------------------

	}
}
