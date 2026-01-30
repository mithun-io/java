package com.advance;

interface PaymentUtil {
	static boolean validateAmount(double amount) {
		return amount > 0;
	}
}

class UpiPayment {
	public void pay(double amount) {
		if (!PaymentUtil.validateAmount(amount)) {
			System.out.println("invalid amount");
			return;
		}
		System.out.println("upi payment successful");
		System.out.println("amount: " + amount);
	}
}

public class StaticMethodExample {
	public static void main(String[] args) {
		UpiPayment payment = new UpiPayment();
		payment.pay(1000);
		payment.pay(-500);
	}
}
