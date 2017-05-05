package com.multi;

class PersonUtil {

	public synchronized void sayName(String name) {
		String tName = Thread.currentThread().getName();
		System.out.print(tName + " im..........\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
	}

	public synchronized void sayAge(int age) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " im " + age + " yrs old");
	}
}

class TWork implements Runnable {

	PersonUtil personUtil = new PersonUtil();

	public void run() {

		String name = Thread.currentThread().getName();

		if (name.equals("thread-1") || name.equals("thread-2")) {
			personUtil.sayName("NAME");
		}
		if (name.equals("thread-3")) {
			personUtil.sayAge(30);
		}

	};
}

public class Thread_Sync_Method_Ex {

	public static void main(String[] args) {

		TWork work = new TWork();
		

		Thread thread1 = new Thread(work, "thread-1");
		Thread thread2 = new Thread(work, "thread-2");

		Thread thread3 = new Thread(work, "thread-3");

		thread1.start();
		//thread2.start();
		thread3.start();

	}

}
