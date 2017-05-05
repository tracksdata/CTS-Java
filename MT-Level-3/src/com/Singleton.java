package com;

public enum Singleton {

	// private volatile final static Singleton instance = null;
	INSTANCE;


	private Singleton() {
		// TODO Auto-generated constructor stub
		System.out.println("Singleton instance created...");
	}

	public void m() {
		System.out.println("m()");
	}

	// public static Singleton getInstance() {
	//
	// // synchronized (Singleton.class) {
	// if (instance != null) {
	// return instance;
	// }
	// // }
	//
	// synchronized (Singleton.class) {
	//
	// if (instance == null) {
	// instance = new Singleton(); // obj constructions initally
	// // happern l1-cace
	// }
	//
	// return instance;
	//
	// }
	//
	// }

}
