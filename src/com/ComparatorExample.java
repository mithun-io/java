package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(101, "John", 50000));
		list.add(new Employee(102, "Emma", 60000));
		list.add(new Employee(103, "Ravi", 45000));

		Collections.sort(list, new SortBySalary());

		for (Employee e : list) {
			System.out.println(e);
		}
	}
}

class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return id + "  " + name + "  " + salary;
	}
}

class SortBySalary implements Comparator<Employee> {
	public int compare(Employee employeeOne, Employee employeeTwo) {
		return Double.compare(employeeOne.salary, employeeTwo.salary);
	}
}
