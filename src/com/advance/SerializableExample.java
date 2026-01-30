package com.advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// case 1: serialize
class Student implements Serializable {
	int empno;
	String ename;
	
	public Student(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Student [empno=" + empno + ", ename=" + ename + "]";
	}
}

public class SerializableExample {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Student student = new Student(7902, "smith");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.txt"));
		objectOutputStream.writeObject(student);
		objectOutputStream.close();
		
		System.out.println("object serialized successfully");
	}
}

// case 2: deserialize
public class DeSerializableExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.txt"));
		
		Student student = (Student) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println(student.empno);
		System.out.println(student.ename);
		
		System.out.println("object de-serialized successfully");
	}
}

