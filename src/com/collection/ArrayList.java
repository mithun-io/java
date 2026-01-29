package com.collection;

public class ArrayList {
	Object[] arr;
	int defaultCapacity;
	int index = 0;

	ArrayList() {
		defaultCapacity = 10;
		arr = new Object[defaultCapacity];
	}

	ArrayList(int capacity) {
		defaultCapacity = capacity;
		arr = new Object[capacity];
	}

	boolean contains(Object data) {
		for (int i = 0; i < index; i++) {
			if (arr[i] != null && data.equals(arr[i]))
				return true;
		}
		return false;
	}

	void add(Object data) {
		if (!contains(data)) {
			if (index < arr.length) {
				arr[index++] = data;
			} else {
				ensureCapacity();
				arr[index++] = data;
			}
		}
	}

	void removeIndex(int idx) {
		if (idx >= 0 && idx < index) {
			for (int i = idx; i < index - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[--index] = null;
		}
	}

	void removeData(Object data) {
		for (int i = 0; i < index; i++) {
			if (arr[i] != null && arr[i].equals(data)) {
				removeIndex(i);
				i--; // adjust index since elements shifted
			}
		}
	}

	int size() {
		return index;
	}

	void ensureCapacity() {
		defaultCapacity = defaultCapacity * 3 / 2 + 1;
		Object[] temp = new Object[defaultCapacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	Object get(int idx) {
		if (idx >= 0 && idx < index)
			return arr[idx];
		else
			return null;
	}

	public String toString() {
		String str = "[ ";
		for (int i = 0; i < index; i++) {
			if (arr[i] != null)
				str += arr[i] + " ";
		}
		str += "]";
		return str;
	}

	void display() {
		for (int i = 0; i < index; i++) {
			if (arr[i] != null)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();

		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		System.out.println("Before remove:");
		arraylist.display();

		arraylist.removeIndex(4);

		arraylist.removeData(40);

		System.out.println("\nAfter remove:");
		arraylist.display();

		System.out.println("\nSize: " + arraylist.size());

		System.out.println("Array elements: " + arraylist.toString());
	}
}
