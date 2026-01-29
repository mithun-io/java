package com.collection;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Iterator;

public class LinkedHashSetMethods {
	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<>();

		// Add / Remove
		set.add("Java"); // add(E)
		set.add("Python");
		set.add("C");

		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Spring");
		set2.add("Hibernate");

		set.addAll(set2); // addAll(Collection)

		set.remove("C"); // remove(Object)

		set.removeAll(Arrays.asList("Hibernate")); // removeAll(Collection)

		set.retainAll(Arrays.asList("Java", "Python", "Spring")); // retainAll(Collection)

		// Query
		System.out.println(set.contains("Java")); // contains(Object)

		System.out.println(set.containsAll(Arrays.asList("Java", "Spring")));
		// containsAll(Collection)

		// Size & State
		System.out.println(set.size()); // size()

		System.out.println(set.isEmpty()); // isEmpty()

		set.clear(); // clear()

		// Add again (for iteration & conversion)
		set.addAll(Arrays.asList("Java", "Spring", "Python"));

		// Iteration & Conversion
		Iterator<String> itr = set.iterator(); // iterator()
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		set.forEach(e -> System.out.println(e)); // forEach()

		Object[] objArray = set.toArray(); // toArray()
		System.out.println(Arrays.toString(objArray));

		System.out.println(set.toString()); // toString()
	}
}
