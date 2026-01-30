package com.advance;

public class DefaultMethod {

	interface Payment {

		void pay(double amount);

		default double calculateGst(double amount) {
			return amount * 0.18;
		}
	}

	static class CreditCardPayment implements Payment {

		// overriding default method
		@Override
		public double calculateGst(double amount) {
			return amount * 0.12;
		}

		@Override
		public void pay(double amount) {
			double gst = calculateGst(amount);
			System.out.println("credit card payment");
			System.out.println("amount: " + amount);
			System.out.println("gst: " + gst);
			System.out.println("total: " + (amount + gst));
		}
	}

	public static void main(String[] args) {
		Payment payment = new CreditCardPayment();
		payment.pay(1000);
	}
}
