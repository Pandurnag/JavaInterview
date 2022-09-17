package com.javatpoint.interviewjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		
		Function<Integer, String> function =(t)-> "10";
	    // System.out.println(function.apply(88));
		
		List<Number> list=Arrays.asList(23,4,6,8,9,1,2.10);
		// >4 23,6,8,9,10
		//6,8,9,10,23
		
		Predicate<Integer> predicate=t-> t>4;
		
		list.stream().filter(t->t>4).sorted().forEach(System.out::println);
		
		public static void printElement(int i) {
			System.out.println(i);
		}
	
	    
	   List<Employee> employees = Stream.of(
			   new Employee(1, "Basant", "DEV", 50000),
			   new Employee(8, "santosh", "DEV", 80000),
			   new Employee(3, "pratik", "QA", 60000),
			   new Employee(9, "Dipak", "QA", 90000),
			   new Employee(4, "Basant", "DEVOPS", 40000))
	     .collect(Collectors.toList());
	}
	public static void printElement(int i) {
		System.out.println(i);
	
	
	
	}
	

}
