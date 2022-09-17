package com.javatpoint.interview;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		
	
	ArrayList<String> list = new ArrayList<String>();

	list.add("P");
	list.add("b");
	list.add("c");
	list.add("n");
	list.add("m");

	Collections.sort(list);
	
	System.out.println(list);

	
	Collections.reverse(list);

	System.out.println(list);

	}
}
