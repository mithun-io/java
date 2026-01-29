package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListAllMethods {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// Add Methods
		list.add("Java"); // add(E)
		list.add("Python");
		list.add("C");

		list.add(1, "Spring"); // add(index, E)

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("HTML");
		list2.add("CSS");

		list.addAll(list2); // addAll(Collection)

		list.addAll(2, Arrays.asList("SQL", "Hibernate")); // addAll(index, Collection)

		// Remove Methods
		list.remove(0); // remove(index)

		list.remove("CSS"); // remove(Object)

		list.removeAll(Arrays.asList("SQL")); // removeAll(Collection)

		list.retainAll(Arrays.asList("Java", "Spring", "Python", "Hibernate")); // retainAll

		list.clear(); // clear()

		// Add again (for further operations)
		list.addAll(Arrays.asList("Java", "Spring", "Python", "Java"));

		// Access & Modify
		System.out.println(list.get(0)); // get(index)

		list.set(1, "Microservices"); // set(index, E)

		System.out.println(list.contains("Java")); // contains(Object)

		System.out.println(list.indexOf("Java")); // indexOf(Object)

		System.out.println(list.lastIndexOf("Java")); // lastIndexOf(Object)

		// Size & State
		System.out.println(list.size()); // size()

		System.out.println(list.isEmpty()); // isEmpty()

		// Conversion
		Object[] objArray = list.toArray(); // toArray()
		System.out.println(Arrays.toString(objArray));

		String[] strArray = list.toArray(new String[0]); // toArray(T[])
		System.out.println(Arrays.toString(strArray));

		System.out.println(list.toString()); // toString()

		// Iteration & Views
		Iterator<String> itr = list.iterator(); // iterator()
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.forEach(e -> System.out.println(e)); // forEach()

		List<String> subList = list.subList(0, 2); // subList(from, to)
		System.out.println(subList);

		// Object Methods
		ArrayList<String> clonedList = (ArrayList<String>) list.clone(); // clone()

		System.out.println(list.equals(clonedList)); // equals(Object)
	}
}
