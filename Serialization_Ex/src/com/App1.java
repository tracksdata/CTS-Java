package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.emp.Employee;

/*
 *  serialization
 *  ---------------
 *  
 *  converting java obj-graph into binary-stream,
 *  then we can store binaty in File-system or txr over n/w to another java-process.
 * 
 * 
 *  why we need ?
 *  
 *  --> to keep passive objs away from heap
 *  --> to distribute/share java-objs b/w java-appln over n/w
 *  --> on maintainance to re-store state of an appln.
 *  
 * 
 */

public class App1 {

	public static void main(String[] args) throws Exception {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Nag");
		employee.setSalary(1000.00);

		// ---------------------------------

		File file = new File("emp.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(employee);

		oos.close();

		System.out.println("emp serialized...");

	}

}
