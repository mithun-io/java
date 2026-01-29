package com.specifiers.Family.UncleFamily;

import com.specifiers.Family.MyFamily.Father;

public class Uncle extends Father {
	public static void main(String[] args) {
		Father father = new Father();
		Uncle uncle = new Uncle();
	 // uncle.debitCard(); not possible
		
		// with is a relationship
		uncle.car(); 
	 
	// uncle.bike(); not possible
		uncle.cycle();
	}
}
