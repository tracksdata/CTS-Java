package com.samples;

@FunctionalInterface
interface StringToIntMapper {
	int map(String str);
}

public class FirstLambda {

	public static void main(String[] args) {

		// StringToIntMapper exp=(String str)->str.length();
		//
		// int v=exp.map("Naga");
		// System.out.println(v);
		//
		// ---------------------------------------------

		String str = "Naga";

		int len = new StringToIntMapper() {
			@Override
			public int map(String str) {
				// TODO Auto-generated method stub
				return 0;
			}
		}.map(str);

		// ---------------------------------------------------
		
		

		Runnable r=()->System.out.println("I am Thread..");
		
		Thread thread = new Thread(r);
		
		thread = new Thread(() -> {
			System.out.println("im thread");
		});
		thread = new Thread(() -> {
			System.out.println("im thread");
		});
		thread = new Thread(() -> {
			System.out.println("im thread");
		});
		thread = new Thread(() -> {
			System.out.println("im thread");
		});
		thread = new Thread(() -> {
			System.out.println("im thread");
		});
		thread = new Thread(() -> {
			System.out.println("im thread");
		});
		
		thread.start();

	}

}

//
//
// class TW implements Runnable{
// @Override
// public void run() {
// System.out.println("I am thread....");
// }
// }