package com.javatpoint.interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("mango");
		list.add("mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		
		System.out.println(list.toString());
		Set<String> set=new LinkedHashSet<String>(list);
	    
		System.out.println(set);

	}

}
