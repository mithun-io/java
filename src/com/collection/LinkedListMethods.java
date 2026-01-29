package com.collection;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListMethods {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// Add / Offer
		list.add("Java"); // add(E)

		list.addFirst("Python"); // addFirst(E)

		list.addLast("C"); // addLast(E)

		list.offer("Spring"); // offer(E)

		list.offerFirst("HTML"); // offerFirst(E)

		list.offerLast("CSS"); // offerLast(E)

		// Remove / Poll
		list.remove(); // remove()

		list.removeFirst(); // removeFirst()

		list.removeLast(); // removeLast()

		list.poll(); // poll()

		list.pollFirst(); // pollFirst()

		list.pollLast(); // pollLast()

		// Add again (for further operations)
		list.add("Java");
		list.add("Spring");
		list.add("Python");
		list.add("Java");

		// Peek
		System.out.println(list.peek()); // peek()

		System.out.println(list.peekFirst()); // peekFirst()

		System.out.println(list.peekLast()); // peekLast()

		// Iteration
		Iterator<String> itr = list.iterator(); // iterator()
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.forEach(e -> System.out.println(e)); // forEach()

		ListIterator<String> listItr = list.listIterator(); // listIterator()
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		Iterator<String> descItr = list.descendingIterator(); // descendingIterator()
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}

		// Access & Search
		System.out.println(list.get(0)); // get(int index)
		list.set(1, "Microservices"); // set(int index, E element)

		System.out.println(list.contains("Java")); // contains(Object)

		System.out.println(list.indexOf("Java")); // indexOf(Object)

		System.out.println(list.lastIndexOf("Java")); // lastIndexOf(Object)
	}
}
