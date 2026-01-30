package com;

import java.util.Optional;

public class Main {

	public static void optionalValue() {
		Optional<Integer> optional = Optional.ofNullable(9455);
		System.out.println(optional);
	}

	public static void optionalNull() {
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(optional);

		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println(opt.orElse("default value"));
	}

	public static void main(String[] args) {
		optionalValue();
		optionalNull();
	}
}

// --------------- real-time example
class UserService {
	Optional<String> getUserNameById(int id) {
		if (id == 1) {
			return Optional.of("smith");
		}
		return Optional.empty();
	}
}

class OptionalRealTime {
	public static void main(String[] args) {
		UserService service = new UserService();

		String name = service.getUserNameById(2).orElse("user Not found");
		System.out.println(name);
	}
}

//--------------- ifPresentOrElse example
class OptionalClass {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.empty();
		System.out.println(optional);

		try {
		    optional.ifPresentOrElse(value -> { System.out.println(value); }, () -> { System.out.println("value is empty"); } );
		} catch (Exception e) {
		    System.out.println(e);
		}

	}
}
