package com.advance;

import java.util.Arrays;
import java.util.List;

class Triangle {
	double area(double x, double y) {
		return 0.5 * x * y;
	}
}

class Example {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
	
		List<double[]> list = Arrays.asList(new double[] {1, 3}, new double[] {8, 9}, new double[] {5, 6}, new double[] {2, 4});
		list.forEach(x -> System.out.println(triangle.area(x[0], x[1])));
	}
}
