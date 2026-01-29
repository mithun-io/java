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
final class Bank {
	void displayRate() {
	    System.out.println("Interest Rate: 7%");
	}
}

/* his will cause a compile-time error if you try to extend
 * class SBI extends Bank { } 
 * Error: cannot subclass the final class Bank
 */

class Main {
public static void main(String[] args) {
    Bank bank = new Bank();
    bank.displayRate();
}
}

