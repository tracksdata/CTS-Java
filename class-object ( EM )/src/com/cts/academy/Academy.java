package com.cts.academy;

import com.cts.emp.Employee;

public class Academy {

	//
	public static void doManageTng() {

		// create employees with trainer

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 123;
		e1.name = "Masthan";

		Employee e2 = new Employee();
		e2.id = 122;
		e2.name = "Emp";

		// teach and let listen

		Employee.doTeach();

		e1.doListen();
		e2.doListen();

	}

}
