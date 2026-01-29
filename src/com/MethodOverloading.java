package com;

class BookMyShow {

	// Book tickets by number of seats
	static void book(int numberOfSeats) {
		System.out.println("booking tickets by number of seats");
	}

	// Book tickets by movie name
	static void book(String movieName) {
		System.out.println("booking tickets for movie: " + movieName);
	}

	// Book tickets by number of seats and movie name
	void book(int numberOfSeats, String movieName) {
		System.out.println("booking " + numberOfSeats + " seats for movie: " + movieName);
	}

	// Book tickets by movie name and number of seats
	void book(String movieName, int numberOfSeats) {
		System.out.println("booking " + numberOfSeats + " seats for movie: " + movieName);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		BookMyShow bookMyShow = new BookMyShow();

		BookMyShow.book(5); 			// static method
		BookMyShow.book("dies irae"); 	// static method
		bookMyShow.book(3, "dies irae"); // non-static method
		bookMyShow.book("dies irae", 2); // non-static method
	}

}
