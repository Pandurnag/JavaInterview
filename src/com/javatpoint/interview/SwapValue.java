package com.javatpoint.interview;

import java.util.Scanner;

public class SwapValue {
	public static void main(String[] args) {
		
	System.out.println("Enter the value A and B");
	Scanner sc=new Scanner(System.in);
	
	
	int A=sc.nextInt();
	int B=sc.nextInt();

	System.out.println("before swapping:" +A + " "+B );
	A=A+B;
	B=A-B;
	A=A-B;
	
	System.out.println("After swapping:"+A+" "+B);
	
}
}