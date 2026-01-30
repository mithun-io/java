package com;

public class StringClass {
	public static void main(String[] args) {
		String one = new String("java");
		String two = new String("java");
		String three = "java";
		String four = "java";

		System.out.println(one == two); 	    // false
		System.out.println(one.equals(two));    // true
				
		System.out.println(three == four);	    // true
		System.out.println(three.equals(four)); // true
	}
}

// final class
// final class cannot be inherited causes compile time error
final class Bank {
	void displayRate() {
	    System.out.println("Interest Rate: 7%");
	}
}

class Main {
public static void main(String[] args) {
    Bank bank = new Bank();
    bank.displayRate();
}
}
