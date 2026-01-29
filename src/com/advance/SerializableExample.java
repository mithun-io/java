package com.advance;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// case 1: 
class Student implements Serializable {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class SerializableExample {
	public static void main(String[] args) throws Exception {

		Student s = new Student(1, "smith");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));

		oos.writeObject(s);
		oos.close();

		System.out.println("object serialized successfully");
	}
}

// case 2:
class Employee {
	int id = 10;
}

class SerializableFail {
	public static void main(String[] args) throws Exception {

		Employee e = new Employee();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));

		oos.writeObject(e); // Exception here
		// NotSerializableException
	}
}