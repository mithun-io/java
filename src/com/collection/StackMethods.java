package com.collection;

import java.util.Stack;

public class StackMethods {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// Core Methods – push
		stack.push("Java"); // push(E)
		stack.push("Python");
		stack.push("C");
		System.out.println("Stack after push: " + stack);

		// Core Methods – peek
		System.out.println("Top element: " + stack.peek()); // peek()

		// Core Methods – pop
		System.out.println("Removed element: " + stack.pop()); // pop()
		System.out.println("Stack after pop: " + stack);

		// Core Methods – empty
		System.out.println("Is stack empty? " + stack.empty()); // empty()

		// Core Methods – search
		System.out.println("Position of Java: " + stack.search("Java")); // search(Object)
		System.out.println("Position of Python: " + stack.search("Python"));
	}
}
