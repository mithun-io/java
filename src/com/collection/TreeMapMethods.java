package com.collection;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class TreeMapMethods {
	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();

		// Basic
		map.put(1, "Java"); // put(K, V)
		map.put(3, "Python");
		map.put(2, "C");

		System.out.println(map.get(1)); // get(K)

		map.remove(2); // remove(K)

		// Query
		System.out.println(map.containsKey(1)); // containsKey(K)

		System.out.println(map.containsValue("Python")); // containsValue(V)

		// Size & State
		System.out.println(map.size()); // size()

		System.out.println(map.isEmpty()); // isEmpty()

		// Views
		Set<Integer> keys = map.keySet(); // keySet()
		System.out.println(keys);

		Collection<String> values = map.values(); // values()
		System.out.println(values);

		Set<Map.Entry<Integer, String>> entries = map.entrySet(); // entrySet()
		System.out.println(entries);

		// Multi / Default
		TreeMap<Integer, String> map2 = new TreeMap<>();
		map2.put(4, "Spring");
		map2.put(5, "Hibernate");

		map.putAll(map2); // putAll(Map)

		System.out.println(map.getOrDefault(6, "Not Found")); // getOrDefault(K, defaultV)

		// Replace & Conditional
		map.replace(1, "Core Java"); // replace(K, V)

		map.replace(3, "Python", "Advanced Python"); // replace(K, oldV, newV)

		map.putIfAbsent(2, "C++"); // putIfAbsent(K, V)

		// Compute / Merge
		map.computeIfAbsent(6, k -> "AWS"); // computeIfAbsent()

		map.computeIfPresent(1, (k, v) -> v + " Programming"); // computeIfPresent()

		map.compute(3, (k, v) -> v + " Language"); // compute()

		map.merge(2, " Basics", (oldV, newV) -> oldV + newV); // merge()

		// TreeMap-Specific
		System.out.println(map.firstKey()); // firstKey()

		System.out.println(map.lastKey()); // lastKey()

		System.out.println(map.headMap(3)); // headMap(K)

		System.out.println(map.tailMap(3)); // tailMap(K)

		System.out.println(map.subMap(2, 5)); // subMap(K1, K2)

		System.out.println(map.comparator()); // comparator()

		// Clear
		map.clear(); // clear()
		System.out.println(map);
	}
}
