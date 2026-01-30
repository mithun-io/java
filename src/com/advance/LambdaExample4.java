package com.advance;

interface Circle {
	double area(int radius);
}

class Main {
	public static void main(String[] args) {
		Circle circle = (int radius) -> {
			final double PI = 3.142;
			return PI * radius * radius;
		};
		System.out.println(circle.area(20));
	}
}
