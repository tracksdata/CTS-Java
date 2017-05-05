package com;

import com.god.God;
import com.live.Animal;
import com.live.Human;
import com.live.Robo;

public class App {

	public static void main(String[] args) {

		// Init

		God god = new God();

		Human human = new Human();
		Animal animal = new Animal();
		Robo robo = new Robo();

		// use

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robo);

	}

}
