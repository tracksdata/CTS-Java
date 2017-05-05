package com;

class Abc {
	
	Object mutex1=new Object();

	public synchronized static void m1() throws InterruptedException {
		String name = Thread.currentThread().getName();
		System.out.println(name + " start - m1()");
		Thread.sleep(5000);
		System.out.println(name + " end - m1()");
	}

	public synchronized static void m2() throws InterruptedException {
		String name = Thread.currentThread().getName();
		System.out.println(name + " start - m2()");
		Thread.sleep(5000);
		System.out.println(name + " end - m2()");
	}
	
	public  void m3() throws InterruptedException {
		String name = Thread.currentThread().getName();
		
		synchronized (mutex1) {
			System.out.println(name + " start - m3()");
			Thread.sleep(5000);
			System.out.println(name + " end - m3()");
		}
	
		
	}
	public synchronized void m4() throws InterruptedException {
		String name = Thread.currentThread().getName();
		System.out.println(name + " start - m4()");
		Thread.sleep(5000);
		System.out.println(name + " end - m()");
	}

}

public class Lock_Ex {

	public static void main(String[] args) {
		
		Abc abc=new  Abc();

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					//Abc.m1();
					abc.m3();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "A1").start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					//Abc.m1();
					abc.m3();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "A2").start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
				//Abc.m2();
					abc.m4();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "B").start();
		
		
	}

}
