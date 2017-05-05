package com.ex;

class InvalidAgeException extends RuntimeException {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String getMessage() {
		return "Hello kid , your are " + this.getAge() + " ! go school and study";
	}

}

class CustomerService {
	public void subscribe(int age) {
		if (age > 18 && age < 64) {
			System.out.println("Welcome...to our service");
			System.out.println("subscribed...");
		} else {
			InvalidAgeException iae = new InvalidAgeException();
			iae.setAge(age);
			throw iae;
		}
	}
}

public class App {

	public static void main(String[] args) {

		CustomerService cs = new CustomerService();
		try {
			cs.subscribe(12);
		} catch (InvalidAgeException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
