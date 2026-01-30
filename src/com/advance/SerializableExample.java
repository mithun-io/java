package com.advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// case 1: serialize
class Employee implements Serializable {
	int empno;
	String ename;
	
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}
}

public class SerializableExample {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Employee employee = new Employee(7902, "smith");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.txt"));
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		
		System.out.println("object serialized successfully");
	}
}

// case 2: deserialize
public class DeSerializableExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.txt"));
		
		Employee employee = (Employee) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println(employee.empno);
		System.out.println(employee.ename);
		
		System.out.println("object de-serialized successfully");
	}
}

