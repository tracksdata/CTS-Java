package com;

import java.util.HashSet;

class NewCar {

	private String model;
	private String color;

	public NewCar(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewCar other = (NewCar) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}

public class Equals_HashCode_Ex2 {

	public static void main(String[] args) {

		NewCar car1 = new NewCar("BMW", "black");
		NewCar car2 = new NewCar("BMW", "white");

		System.out.println(car1.equals(car2));

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		// --------------------------------------

		HashSet<NewCar> cars = new HashSet<>();
		cars.add(car1);
		cars.add(car2);

		System.out.println(cars.size());
		// -------------------------------------

	}

}
