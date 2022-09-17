package com.javatpoint.interview;

import java.util.ArrayList;

public class Linkdin {
	public static void main(String[] args) {
		
		var list = new ArrayList<>();
		list.add("Monday");
	//	list.add(String::new);
		list.add("Tuesday");
		list.remove(0);
		System.out.println(list.get(0));
		
	}

}
