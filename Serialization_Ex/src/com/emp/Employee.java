package com.emp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//class Location {
//
//}
//
//class Company implements Serializable {
//	private Location location = new Location();
//}

public class Employee implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5375856068426844735L;

	private int id;
	private String name;
	private transient double salary;
	private String address;
	// private Company company = new Company();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("write");
		// out.write("trainer-naga".getBytes());
		// out.close();
		// out.writeObject("Nag");
		// out.writeInt(2016);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("read external..");
	}

}
