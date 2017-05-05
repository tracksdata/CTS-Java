package com.cts;

import com.cts.academy.Academy;

public class App {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start");

		Academy.doManageTng();

		System.out.println(Thread.currentThread().getName() + " end");

	}

}
