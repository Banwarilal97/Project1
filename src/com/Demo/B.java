package com.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class B {
	
	public static void main(String[] args) {
		
		A a = new A();
		TreeMap<String, HashMap<String, ArrayList<String>>> ss =a.IndiaCityName(); 
		System.out.println(ss);
	}

}
