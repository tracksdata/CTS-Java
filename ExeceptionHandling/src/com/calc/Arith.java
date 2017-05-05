package com.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Number-1");
			int n1 = sc.nextInt();

			System.out.println("Enter Number-2");
			int n2 = sc.nextInt();

			// 1.
			System.out.println("1.Add");

			// 2.
			System.out.println("2.Sub");

			// 3.
			System.out.println("3.Div");
			float div = n1 / n2;
			System.out.println("div result: " + div);

			sc.close();

		} catch (InputMismatchException ime) {
			
			/*
			 *  handling code
			 *  
			 *  --> report to end-user with friendly message
			 *  --> log exception
			 *  --> re-throw exception to cosumer-module
			 * 
			 *  --> rollback earlier execution
			 *  
			 *  --> resource free...
			 */
			
			System.out.println("Ex- " + ime.getMessage());
		} catch (ArithmeticException ae) {
			System.out.println("Ex- " + ae.getMessage());
		}

		// 4.
		System.out.println("4.Mul");

		System.out.println("Happy End");

	}

}
