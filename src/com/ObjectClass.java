package com;

import java.util.Objects;

class User {
	String ename;
	int salary;

	User(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ename, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(ename, other.ename) && salary == other.salary;
	}

	public static void main(String[] args) {
		User user = new User("smith", 800);
		System.out.println(user.toString());
	}
}
