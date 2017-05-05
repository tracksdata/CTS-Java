package com.app.single;

import java.util.Scanner;

/*
 *  2 tasks
 *  --------
 *  
 *  1. get name from user , and greet him
 *  2. print number 1 - 100
 * 
 */

class Task1 {
	public void doTask1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name!");
		String name = sc.nextLine();
		System.out.println("Hello  " + name);
		sc.close();
	}
}

class Task2{
	public void doTask2() {
		for (int i = 0; i <100; i++) {
			System.out.println("count-"+(i+1));
		}
	}
}

public class Single_Thread_Appln {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		
		// step-1
		Task1 task1=new Task1();
		task1.doTask1();
		
		//step-2
		Task2  task2=new Task2();
		task2.doTask2();
		
		// step-n...
		
	}
	
}
