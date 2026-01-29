package com.collection;

import java.util.Vector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Enumeration;

public class VectorMethods {
	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		// Add Methods
		vector.add("Java"); // add(E)
		vector.add("Python");
		vector.add("C");

		vector.add(1, "Spring"); // add(index, E)

		vector.addElement("HTML"); // addElement(E)
		vector.addElement("CSS");

		Vector<String> vector2 = new Vector<>();
		vector2.add("SQL");
		vector2.add("Hibernate");

		vector.addAll(vector2); // addAll(Collection)

		vector.addAll(2, Arrays.asList("AWS", "Docker")); // addAll(index, Collection)

		// Remove Methods
		vector.remove(0); // remove(index)

		vector.remove("CSS"); // remove(Object)

		vector.removeElement("HTML"); // removeElement(Object)

		vector.removeElementAt(1); // removeElementAt(index)

		vector.removeAll(Arrays.asList("AWS")); // removeAll(Collection)

		vector.retainAll(Arrays.asList("Java", "Spring", "Python", "Hibernate", "Docker"));
		// retainAll(Collection)

		vector.clear(); // clear()
		// Add again (for further operations)
		vector.addAll(Arrays.asList("Java", "Spring", "Python", "Java"));

		// Access & Modify
		System.out.println(vector.get(0)); // get(index)

		vector.set(1, "Microservices"); // set(index, E)

		System.out.println(vector.contains("Java")); // contains(Object)

		System.out.println(vector.indexOf("Java")); // indexOf(Object)

		System.out.println(vector.lastIndexOf("Java")); // lastIndexOf(Object)

		System.out.println(vector.elementAt(0)); // elementAt(index)

		System.out.println(vector.firstElement()); // firstElement()

		System.out.println(vector.lastElement()); // lastElement()

		// Size & State
		System.out.println(vector.size()); // size()

		System.out.println(vector.isEmpty()); // isEmpty()

		System.out.println(vector.capacity()); // capacity()

		// Conversion
		Object[] objArray = vector.toArray(); // toArray()
		System.out.println(Arrays.toString(objArray));

		String[] strArray = vector.toArray(new String[0]); // toArray(T[])
		System.out.println(Arrays.toString(strArray));

		System.out.println(vector.toString()); // toString()

		// Iteration & Views
		Iterator<String> itr = vector.iterator(); // iterator()
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		vector.forEach(e -> System.out.println(e)); // forEach()

		List<String> subList = vector.subList(0, 2); // subList(from, to)
		System.out.println(subList);

		Enumeration<String> enumeration = vector.elements(); // elements()
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		// Object Methods
		Vector<String> clonedVector = (Vector<String>) vector.clone(); // clone()

		System.out.println(vector.equals(clonedVector)); // equals(Object)
	}
}
