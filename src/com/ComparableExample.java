package com;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(7902, "SMITH", 50000));
		list.add(new Employee(7812, "ALLEN", 60000));
		list.add(new Employee(7832, "MARTIN", 45000));

		Collections.sort(list); // sorts by salary

		for (Employee e : list) {
			System.out.println(e);
		}
	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int compareTo(Employee employee) {
		return Double.compare(this.salary, employee.salary);
	}
}

