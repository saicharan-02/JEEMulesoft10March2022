package com.abc.main;

import java.util.HashMap;
import java.util.Set;

public class MapKeysDemo {

	public static void main(String[] args) {		
		
		HashMap<String,Double> map = new HashMap<>(); // unordered and unsorted
		
		map.put("Iphone", 58000D);
		map.put("Sumsung", 68000D);
		map.put("Nokia", 42000D);
		map.put("Oppo", 88000D);
		map.put("abc", 1254D);
		
		//how to get all keys inside map		
		Set<String> keys = map.keySet();
		
		System.out.println(keys);
		
		//how to get all values inside map
		for(String s: keys) {
			Double d = map.get(s);
			System.out.println(d);
		}
		
//		Iterator<String> i = keys.iterator();
//		while(i.hasNext()) {
//			String s = i.next();
//			Double d = map.get(s);
//			System.out.println(d);
//		}
		

	}

}
