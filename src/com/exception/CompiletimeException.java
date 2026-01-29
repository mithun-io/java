package com.exception;

class MatrimonyException extends Exception {
	private String message;

	MatrimonyException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

public class CompiletimeException {
	public static void marriage() throws MatrimonyException {
		int age = 18;
		if (age >= 21) {
			System.out.println("happy married life");
		} else {
			throw new MatrimonyException("invalid age");
		}
	}

	public static void main(String[] args) {
		try {
			marriage();
		} catch (MatrimonyException e) {
			System.out.println(e.getMessage());
		}
	}
}
