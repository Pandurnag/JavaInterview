package com.javatpoint.interview;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		
	
	final List<Integer> list = new ArrayList<>();
	 list.add(2);
	 list.add(2);
	 list.add(8);
	 list.add(4);
	 list.add(2);

      list.remove(2);

	System.out.println(list);
	}
}
