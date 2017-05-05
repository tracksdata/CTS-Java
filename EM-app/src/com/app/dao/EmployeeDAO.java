package com.app.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.model.Employee;

public class EmployeeDAO {

	private List<Employee> employees = new ArrayList<>();

	public void add(Employee employee) {
		employees.add(employee);
	}

	public List<Employee> findAll() {
		return employees;
	}

	public Employee find(int id) {
		Employee employee = null;
		for (Employee e : employees) {
			if (e.getId() == id) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	public List<Employee> sortBy(String sortBy) {
		if (sortBy.equals("salary")) {
			Collections.sort(employees, new Comparator<Employee>() {
				public int compare(Employee o1, Employee o2) {
					return (int) (o1.getSalary() - o2.getSalary());
				};
			});
		}
		return employees;
	}

	public void update(int id, double salary) {
		for (Employee e : employees) {
			if (e.getId() == id) {
				e.setSalary(salary);
				break;
			}
		}
	}

	public void delete(int id) {
		for (Employee e : employees) {
			if (e.getId() == id) {
				employees.remove(e);
				break;
			}
		}
	}

}
