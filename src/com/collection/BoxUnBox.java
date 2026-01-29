package com.collection;

public class BoxUnBox {
	public static void main(String[] args) {

		// Boxing (Primitive → Wrapper)
		int x = 10;
		Integer y = Integer.valueOf(x);
		System.out.println(y);

		char ch = 'A';
		Character z = Character.valueOf(ch);
		System.out.println(z);

		// Unboxing (Wrapper → Primitive)
		Integer a = Integer.valueOf(20);
		int b = a.intValue();
		System.out.println(b);

		Character c = Character.valueOf('B');
		char d = c.charValue();
		System.out.println(d);
	}
}
