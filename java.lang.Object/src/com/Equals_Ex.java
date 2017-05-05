package com;

class Car {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {

			Car car = (Car) obj;
			if (this.model.equals(car.model)) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

}

public class Equals_Ex {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("BMW", "white");

		System.out.println(car1.equals(car2));
		// System.out.println(car1 == car2);

	}

}
