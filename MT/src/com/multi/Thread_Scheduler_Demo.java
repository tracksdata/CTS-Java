package com.multi;

class Work implements Runnable {

	
	// READY-TO-RUN  ---> RUNNING
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.printf("%s : count-%d \n", name, i);
			
			/*
			 *  RUNNING --> READY-TO-RUN
			 *  RUNNING --> NOT-READY-TO-RUN  ( sleep / block / wait ) 
			 */
			
		}
	} // RUNNING - DEAD

}

public class Thread_Scheduler_Demo {

	public static void main(String[] args) {

		Work work = new Work();

		Thread thread1 = new Thread(work, "Nag");  // NEW
		Thread thread2 = new Thread(work, "Indu");
		Thread thread3 = new Thread(work, "Ria");
		
		thread1.start(); // NEW ---> READY-TO-RUN
		thread2.start();
		thread3.start();
		
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.printf("%s : count-%d \n", name, i);
		}
		
	}

}
