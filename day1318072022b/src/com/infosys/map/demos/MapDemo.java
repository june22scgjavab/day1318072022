package com.infosys.map.demos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Ctrl+Shift+o // for imports

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(2, "two");
		System.out.println(map);

		Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(1, "One");
		lmap.put(5, "Five");
		lmap.put(7, "Seven");
		lmap.put(2, "two");
		System.out.println(lmap);
		
		Map<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "One");
		tmap.put(5, "Five");
		tmap.put(7, "Seven");
		tmap.put(2, "two");
		System.out.println(tmap);

	}

}
