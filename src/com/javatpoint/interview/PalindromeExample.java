package com.javatpoint.interview;

public class PalindromeExample {
	public static void main(String[] args) {
		
		int temp,r,sum=0;
		int n=122;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum) 
			System.out.println("Palindrome Number");
            else 
            	System.out.println("Palindrome Not");
			}			
		}
		


