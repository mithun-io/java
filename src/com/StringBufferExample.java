package com;

class StringBufferExample {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello");

		sb.append(" world");
		sb.insert(5, ",");
		sb.replace(0, 5, "hi");
		sb.delete(2, 3);

		System.out.println(sb);
	}
}
