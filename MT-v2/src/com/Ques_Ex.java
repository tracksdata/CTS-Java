package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Box {

	final private List<String> list;

	private Box(List<String> list) {
		this.list = Collections.unmodifiableList(list);
	}

	public List<String> getList() {
		return list;
	}

	public static Box getBox() {
		List<String> items = new ArrayList<>();
		items.add("item-1");
		items.add("item-2");
		items.add("item-3");
		Box box = new Box(items); // immutable
		return box;
	}

}

public class Ques_Ex {

	public static void main(String[] args) {

		// String s = "abc";
		// System.out.println(s.toUpperCase());

		// ------------------------------------

		Box box=Box.getBox();
	
		// ------------------------------------

	}

}

class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}

class Immutable {

	private final Employee employee;

	public Immutable(Employee employee) {
		this.employee = employee;
	}

	public Employee get() {
		return this.employee;
	}

}
