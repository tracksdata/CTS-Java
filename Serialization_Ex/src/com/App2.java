package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.emp.Employee;

public class App2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("emp.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		
		Employee employee=(Employee) obj;

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}

}
