package com.foo.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapApp {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(null, null);
		map.put(null, 00);
		map.put(1, 11);
		map.put(2, 22);
		map.put(2, 33);
		map.put(3, null);
		
		System.out.println(map);

        char[] chars = new char[] {'\u0097'};
        System.out.println(chars);
        String str = new String(chars);
        System.out.println(str);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));


	}

}
