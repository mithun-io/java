package com.collection;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetMethods {
	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();

		// Add / Remove
		set.add(10); // add(E)
		set.add(30);
		set.add(20);
		set.add(40);

		set.remove(20); // remove(Object)

		// Access
		System.out.println(set.first()); // first()

		System.out.println(set.last()); // last()

		// Navigation
		System.out.println(set.higher(10)); // higher(E)

		System.out.println(set.lower(30)); // lower(E)

		System.out.println(set.ceiling(25)); // ceiling(E)

		System.out.println(set.floor(25)); // floor(E)

		// Remove Extremes
		System.out.println(set.pollFirst()); // pollFirst()

		System.out.println(set.pollLast()); // pollLast()

		// Order / View
		Set<Integer> descendingSet = set.descendingSet(); // descendingSet()
		System.out.println(descendingSet);
	}
}
