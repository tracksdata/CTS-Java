package com.singleton;

import java.io.Serializable;

public enum Singleton  {

	//private volatile static Singleton instance = null;
	INSTANCE;

	private Singleton() {
		// TODO Auto-generated constructor stub
		System.out.println("Singleton instance created...");
	}

	public void m() {
		System.out.println("m()");
	}

	//	protected Object readResolve() {
	//		System.out.println("readResolve()");
	//		return INSTANCE;
	//	}

	//	public static Singleton getInstance() {
	//
	//		// synchronized (Singleton.class) {
	//		if (instance != null) {
	//			return instance;
	//		}
	//		// }
	//
	//		synchronized (Singleton.class) {
	//
	//			if (instance == null) {
	//				instance = new Singleton(); // obj constructions initally
	//				// happern l1-cace
	//			}
	//
	//			return instance;
	//
	//		}
	//
	//	}

}
