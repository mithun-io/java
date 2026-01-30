package com;

class SingletonDesign {
	private static volatile SingletonDesign instance = null;

	private SingletonDesign() {
		System.out.println("instance created");
	}

	public static SingletonDesign getInstance() {
		if (instance == null) {
			synchronized (SingletonDesign.class) {
				if (instance == null) {
					instance = new SingletonDesign();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonDesign one = SingletonDesign.getInstance();
		SingletonDesign two = SingletonDesign.getInstance();

		System.out.println(one == two);
	}
}
