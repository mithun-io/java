package com;

class Student {
	// this calling statement
	Student(int id) {
		System.out.println(id);
	}

	Student(String sname) {
		this(17);
		System.out.println(sname);
	}

	Student(int id, String sname) {
		this("java");
		System.out.println(id + " " + sname);
	}

	Student(String str, int num) {
		this(17, "java");
		System.out.println(str + " " + num);
	}

	public static void main(String[] args) {
		new Student("smith", 101);
	}
}

// super calling statement
class A {
	A(int x) {
		System.out.println("A constructor: " + x);
	}
}

class B extends A {
	B(String y) {
		super(10);
		System.out.println("B constructor" + y);
	}
}

class C extends B {
	C(String str, int num) {
		super("B");
		System.out.println("C constructor");
	}

	public static void main(String[] args) {
		new C("C", 1999);
	}
}
