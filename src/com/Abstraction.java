package com;

interface Animal {
	void noise();
}

class Dog implements Animal {
	public void noise() {
		System.out.println("bow bow");
	}
}

class Cat implements Animal {
	public void noise() {
		System.out.println("meow meow");
	}
}

class Snake implements Animal {
	public void noise() {
		System.out.println("hiss hiss");
	}
}

class Stimulator {
	public static void ansim(Animal animal) {
		animal.noise();
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Snake snake = new Snake();

		Stimulator.ansim(dog);
		Stimulator.ansim(cat);
		Stimulator.ansim(snake);
	}
}
