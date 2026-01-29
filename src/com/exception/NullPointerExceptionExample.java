package com.exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		try {
			String name = null; // String reference is null
			System.out.println(name.length()); // Causes NullPointerException
		}

		catch (NullPointerException e) {
			System.out.println("exception caught: " + e.getMessage());
		}

		finally {
			System.out.println("finally block always executes");
		}
	}
}
