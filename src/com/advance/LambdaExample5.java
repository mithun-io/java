package com.advance;

import java.util.Arrays;
import java.util.List;

interface Circle {
	double area(int radius);
}

class LambdaExample5 {
	public static void main(String[] args) {
		Circle circle = (int radius) -> {
			final double PI = 3.142;
			return PI * radius * radius;
		};

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		list.forEach(x -> System.out.println(circle.area(x)));
	}
}
