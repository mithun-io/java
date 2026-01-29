package com;

class Animal {
}

class Dog extends Animal {
}

public class InstanceOfExample {
	public static void main(String[] args) {
		Animal animal = new Dog();

		System.out.println(animal instanceof Dog);    // true
		System.out.println(animal instanceof Animal); // true
	}
}
