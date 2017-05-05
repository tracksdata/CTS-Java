package com.ex;

class Employee {
	public void doWork() {
		System.out.println("doing work...");
	}
}

public class Try_Catch_Syntax {

	public static void main(String[] args) {

		System.out.println("A");

		try {

			System.out.println("B");
			int ari = 1 / 1;

			int[] nums = { 1, 2, 3, 4 };
			System.out.println(nums[0]);

			Employee employee = null;
			employee.doWork();

			System.out.println("C");
		}
		// catch (ArithmeticException ae) {
		// System.out.println("D1");
		// } catch (ArrayIndexOutOfBoundsException aioobe) {
		// System.out.println("D2");
		// }
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("D1 | D2");
		} catch (Exception e) {
			System.out.println("D3");
		}

		System.out.println("E");

	}

}
