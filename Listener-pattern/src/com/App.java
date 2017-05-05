package com;

import com.ac.AC;
import com.door.Door;
import com.light.Light;

public class App {

	public static void main(String[] args) throws InterruptedException {

		// Init

		Door door = new Door();

		Light light = new Light();
		AC ac = new AC();

		door.addDoorListener(light);
		door.addDoorListener(ac);

		Thread.sleep(5000);

		door.open();

		Thread.sleep(5000);

		door.close();

		door.removeDoorListener(ac);

		Thread.sleep(5000);

		door.open();
		door.close();

	}

}
