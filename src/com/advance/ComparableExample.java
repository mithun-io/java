package com.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // natural ordering (by id)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;   // ascending order
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(new Student(3, "smith"), new Student(1, "allen"), new Student(2, "wards")));
        
        // uses compareTo()
        Collections.sort(list); 

        for (Student student : list) {
            System.out.println(student.id + " " + student.name);
        }
    }
}

/*
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
*/
