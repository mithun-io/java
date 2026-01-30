package com.advance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// -------------------- example one
class MathUtil {
	static void square(int n) {
		System.out.println(n * n);
	}
}

class MethodReference {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		// lambda
		list.forEach(n -> MathUtil.square(n));

		// method reference
		list.forEach(MathUtil::square);
	}
}


//-------------------- example two
class Printer {
	void print(String msg) {
		System.out.println(msg);
	}
}

class MethodReference {
	public static void main(String[] args) {

		Printer printer = new Printer();
		List<String> data = Arrays.asList("java", "spring", "hibernate");
		
		// lambda
		data.forEach(x -> printer.print(x));
		
		// method reference
		data.forEach(printer::print);
	}
}

//-------------------- example three
class Student {
	Student() {
		System.out.println("student object created");
	}
}

class MethodReference {
	public static void main(String[] args) {

		Supplier<Student> supplier = Student::new;
		supplier.get();
	}
}
