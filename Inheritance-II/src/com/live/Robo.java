package com.live;

public class Robo extends LivingThing {

	@Override
	public void eat() {
		System.out.println("Robot eat elec-power");
	}

	@Override
	public void work() {
		System.out.println("Robo work with sensors");
	}

}
