package com;

import com.car.Car;
import com.ceat.wheel.CEATWheel;
import com.mrf.wheel.MRFWheel;
import com.wheel.Wheel;

public class App {

	public static void main(String[] args) {

		// Init
		Wheel mrfWheel = new MRFWheel();
		Wheel ceatWheel = new CEATWheel();

		Car myCar = new Car(ceatWheel);

		// Use
		myCar.move();

	}

}
