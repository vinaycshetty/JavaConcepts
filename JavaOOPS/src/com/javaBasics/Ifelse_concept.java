package com.javaBasics;

public class Ifelse_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		int c = 20;
		
		
		
		// Comparison operators 
		// < , > , <= , >= , == , !=
		
		if(a<b) {
			System.out.println("b is greater");
		}
		
		if(a==c) {
			System.out.println("both a and c are equal");
		}
		
		if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		
		if(a!=b) {
			System.out.println("Both a and b are not equal");
		}
		
		if(b<=a) {
			System.out.println("a is lessthen or equal to b");
		}
		else if(b>=c) {
			System.out.println("b is greater or equal to c");
		}
		
		// write a programm to find highest of 3
		
		int x = 200;
		int y = 400;
		int z = 600;
		
		if(x>y & x>z) {
			System.out.println("x is greater");
		}
		else if (y>x & y>z) {
			System.out.println("y is greater");
		}
		else {
			System.out.println("z is greater");
		}

	}

}
