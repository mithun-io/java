package com.collection;

import java.util.ArrayList;

class Employee {

	int employeeId;
	String employeeName;
	double employeeSalary;

	// constructor
	Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	// display method
	void display() {
		System.out.println(employeeId + "  " + employeeName + "  " + employeeSalary);
	}
}

public class StoreObjects {
	public static void main(String[] args) {

		// Creating ArrayList to store Employee objects
		ArrayList<Employee> employeeList = new ArrayList<>();

		// Adding user-defined objects
		employeeList.add(new Employee(101, "Smith", 50000));
		employeeList.add(new Employee(102, "Allen", 60000));
		employeeList.add(new Employee(103, "Ward", 55000));

		// Displaying objects from ArrayList
		for (Employee emp : employeeList) {
			emp.display();
		}
	}
}
