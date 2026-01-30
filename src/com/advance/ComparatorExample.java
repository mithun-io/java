package com.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name); // alphabetical order
	}
}

public class ComparatorExample {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(3, "smith"));
		list.add(new Student(1, "allen"));
		list.add(new Student(2, "wards"));

		Collections.sort(list, new NameComparator());

		for (Student student : list) {
			System.out.println(student.id + " " + student.name);
		}
	}
}
