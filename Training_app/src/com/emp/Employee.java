package com.emp;

import com.trainer.Trainer;

public class Employee {

	private Trainer trainer;

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public void learn() {

		if (trainer == null) {
			System.out.println("emp on self learning..");
			return;
		}

		trainer.doTraining("core-java");
		System.out.println("emp learnt from trainer");

	}

}
