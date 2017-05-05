package com;

class Car {

	private String model;
	private String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}

public class Equals_Ex {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("BMW", "white");

		System.out.println(car1.equals(car2));

		// --------------------------------

		String s1 = "abc";
		String s2 = "abc";

		System.out.println(s1.equals(s2));

		// --------------------------------

	}

}
