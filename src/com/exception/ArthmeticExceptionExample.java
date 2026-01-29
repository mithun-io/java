package com.exception;

public class ArthmeticExceptionExample {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a / b; // Causes ArithmeticException
			System.out.println("result: " + result);
		}

		catch (ArithmeticException e) {
			System.out.println("exception caught: " + e.getMessage());
		}

		finally {
			System.out.println("finally block always executes");
		}
	}
}
