package com.collection;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	public static void main(String[] args) {

		// Collection with Wrapper type
		List<Integer> list = new ArrayList<>();

		// Adding primitive values
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list);

		// Internally (what actually happens)
		Object obj = Integer.valueOf(10);
		System.out.println(obj);
	}
}
