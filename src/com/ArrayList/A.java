package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(40);
		

		System.out.println(al.get(3));

		//Collections.max(al);

		for (Object object : al) {
			System.out.println(object);
		}
	}
}
