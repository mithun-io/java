package com.exception;

public class ArrayIndexOutOFBoundExceptionExample {
	public static void main(String[] args) {
		try {
			int[] arr = { 10, 20, 30 };
			System.out.println(arr[5]); // accessing invalid index (5) -> causes exception
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught: " + e.getMessage());
		}

		finally {
			System.out.println("finally block always executes");
		}
	}
}
