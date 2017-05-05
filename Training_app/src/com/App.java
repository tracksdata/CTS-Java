package com;

import com.emp.Employee;
import com.trainer.JavaTrainer;
import com.trainer.Trainer;

public class App {

	public static void main(String[] args) {

		// init -- Academy

		Employee employee1 = new Employee();
		Trainer trainer = new JavaTrainer();

		employee1.setTrainer(trainer);

		// Use
		employee1.learn();

	}

}
