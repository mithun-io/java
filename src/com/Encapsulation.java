package com;

class SBI {
	private String password = "@encapsulation";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.getPassword());
		
		sbi.setPassword("@javaBean");
		
		System.out.println(sbi.getPassword());
	}
}
