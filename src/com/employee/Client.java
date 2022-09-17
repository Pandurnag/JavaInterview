package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		
		
		Employee e = new Employee("E001", "Pandurang", 28, 12000, "IT");
		Employee e1 = new Employee("E002", "Vaijentah", 20, 16000, "IT");
		Employee e2 = new Employee("E003", "Vijay", 25, 22000, "IT");
		Employee e3 = new Employee("E004", "Rakesh", 32, 46000, "IT");
		Employee e4 = new Employee("E005", "Rokadu", 30, 12000, "IT");
		Employee e5 = new Employee("E006", "Vyakant", 78, 43000, "IT");
		
		
		List<Employee> emp = new ArrayList<>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		//find the second height salaried employee from given list java8
		
		//Our approach
		/*
		 * list convert to stream will, sort the employee based on salary in asc order
		 * then will reversed the list and then skip first one and then call findFirst()
		 * to the second highest salaried employee
		 */
		
		
		emp.stream().sorted(Comparator.comparing(Employee:: getSalary).reversed())
		.skip(2).findFirst()
		.ifPresent(s->System.out.println(s));
		
		
		
	}

}
