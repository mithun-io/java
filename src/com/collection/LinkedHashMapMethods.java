package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMapMethods {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Basic
        map.put(1, "Java"); // put(K, V)
        map.put(2, "Python");
        map.put(3, "C");

        System.out.println(map.get(1)); // get(K)

        map.remove(3); // remove(K)


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
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(4, "Spring");
        map2.put(5, "Hibernate");

        map.putAll(map2); // putAll(Map)

        System.out.println(map.getOrDefault(6, "Not Found")); // getOrDefault(K, defaultV)


        // Replace & Conditional
        map.replace(1, "Core Java"); // replace(K, V)

        map.replace(2, "Python", "Advanced Python"); // replace(K, oldV, newV)

        map.putIfAbsent(3, "C++"); // putIfAbsent(K, V)


        // Compute / Merge
        map.computeIfAbsent(6, k -> "AWS"); // computeIfAbsent()

        map.computeIfPresent(1, (k, v) -> v + " Programming"); // computeIfPresent()

        map.compute(2, (k, v) -> v + " Language"); // compute()

        map.merge(3, " Basics", (oldV, newV) -> oldV + newV); // merge()


        // Clear
        map.clear(); // clear()
        System.out.println(map);
    }
}











