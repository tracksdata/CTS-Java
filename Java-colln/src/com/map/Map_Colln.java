package com.map;

import java.util.HashMap;
import java.util.Scanner;

class Ower {

	String name;

	public Ower(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Ower other = (Ower) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

}

public class Map_Colln {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("Audi", "white");

		Ower ower1 = new Ower("Nag");
		Ower ower2 = new Ower("Ria");

		// --------------------------------------

		HashMap<Ower, Car> map = new HashMap<>();
		map.put(ower1, car1);
		map.put(ower2, car2);

		// ---------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("enter ower name");
		String name = sc.nextLine();

		Ower key = new Ower(name);

		Car car = map.get(key);
		if (car != null) {
			System.out.println(car.model);
		} else {
			System.out.println("dream it");
		}

	}

}
