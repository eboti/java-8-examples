package com.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapSameKey {

	// in case of same key, the last will be found (when map.get() or in any
	// iteration)
	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<>();
		map.put(0L, "1stItem");
		map.put(1L, "2ndItem");
		map.put(1L, "3rdItem");

		map.forEach((k, v) -> {
			if (k.equals(1L))
				System.out.println(k + ", " + v);
		});
		// System.out.println(map.get(1L));

		Map<Long, String> treeMap = new TreeMap<>();
		treeMap.put(0L, "1stItem");
		treeMap.put(1L, "2ndItem");
		treeMap.put(1L, "3rdItem");

		String collect = treeMap.entrySet().stream()
				.peek(System.out::println)
				.filter(e -> e.getKey().equals(1L))
				.map(e -> e.getValue())				
				.collect(Collectors.joining());

		System.out.println(collect);

	}

}
