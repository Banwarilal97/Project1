package com.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class A {

	TreeMap<String, HashMap<String, ArrayList<String>>> IndiaCityName() {

		ArrayList<String> almh = new ArrayList<>();
		almh.add("Pune");
		almh.add("Mumbai");
		almh.add("Nashik");

		ArrayList<String> almp = new ArrayList<>();
		almp.add("Indore");
		almp.add("Bhopal");
		almp.add("Neemuch");

		ArrayList<String> alup = new ArrayList<>();
		alup.add("Ayodhya");
		alup.add("Kashi");
		alup.add("Varansi");

		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		hm.put("MH", almh);
		hm.put("MP", almp);
		hm.put("UP", alup);

		System.out.println(hm);

		TreeMap<String, HashMap<String, ArrayList<String>>> tm = new TreeMap<String, HashMap<String, ArrayList<String>>>();
		tm.put("INDIA", hm);

		System.out.println(tm);
		
		return tm;
	}

}
