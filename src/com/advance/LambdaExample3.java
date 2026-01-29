package com.advance;

import java.util.ArrayList;
import java.util.List;

class Triangle {
	double area(double a, double b) {
		return 0.5 * a * b;
	}
}

class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();

		// List of base & height values
		List<double[]> list = new ArrayList<>();
		list.add(new double[] { 10, 5 });
		list.add(new double[] { 8, 4 });
		list.add(new double[] { 6, 3 });

		// forEach loop (direct output)
		list.forEach(values -> System.out.println(triangle.area(values[0], values[1])));
	}
}
