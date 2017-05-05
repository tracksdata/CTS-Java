package com.multi;

class Trainer extends Thread {

	public Trainer(String name) {
		super(name);
	}

	public void run() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " working on doubt....");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(name + " fixed that proplem");

	};

}

class Employee extends Thread {

	public Employee(String name) {
		super(name);
	}

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " learning....");
		System.out.println(name + " got problem");
		//
		// -----------------------------------------
		Trainer trainer = new Trainer("Nag");
		trainer.start();
		// -------------------------------------------

		/**
		 * join
		 * 
		 * Waits for this thread to die.
		 * 
		 */
		try {
			trainer.join(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " further working  after trainer");

	}
}

public class Thread_Join_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee("Emp");
		employee.start();

	}

}
