package com;

import java.util.Arrays;
import java.util.List;

interface Triangle {
	double area(double x, double y);
}

class LambdaExample2 {
	public static void main(String[] args) {
	 // Triangle triangle = (x, y) -> 0.5 * x * y;
		Triangle triangle = (x, y) -> {
			return 0.5 * x * y;
		};

		List<double[]> list = Arrays.asList(new double[] { 1, 2 }, new double[] { 3, 4 }, new double[] { 5, 6 }, new double[] { 7, 8 });
		list.forEach(n -> System.out.println(triangle.area(n[0], n[1])));
	}
}
