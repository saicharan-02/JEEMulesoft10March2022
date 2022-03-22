package com.abc.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//Hashtable<String,Double> map = new Hashtable<>(); // similar to HashMap but nulls are not allowed
		
		HashMap<String,Double> map = new HashMap<>(); // unordered and unsorted
		
		//LinkedHashMap<String,Double> map =  new LinkedHashMap<>();  // maintains insertion order
		
		//TreeMap<String,Double> map = new TreeMap<>(); // sorted on keys
		
		map.put("Iphone", 58000D);
		map.put("Sumsung", 68000D);
		map.put("Nokia", 42000D);
		map.put("Oppo", 88000D);
		map.put("abc", 1254D);
		//map.put(null, null);
		
		
		System.out.println(map);
		
		String input = "Oppo";
		
		Double price = map.get(input);
		
		if(price !=null) {
						
			System.out.println(price);
		}
		else {
			System.out.println("Not existing");
		}	

	}

}
