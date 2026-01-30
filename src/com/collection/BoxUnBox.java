package com.collection;

public class BoxUnBox {
	public static void boxUnbox() {
		int x = 10;
		Integer y = Integer.valueOf(x);
		System.out.println(y);

		Integer a = Integer.valueOf(20);
		int b = a.intValue();
		System.out.println(b);
	}

	public static void main(String[] args) {
		boxUnbox();
	}
}
