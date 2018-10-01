package com.javaBasics;

public class IncrementalDecrementalInJava {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		System.out.println("value before incremental/decremental");
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("value after incremental/ decremental ---- post increment");
		int x = i++;// post increment  --- it will first assign the current value to x and then increment its will by one
		System.out.println("x = "+x);
		System.out.println("i = "+i);
		
		System.out.println("value after incremental/ decremental ---- pre increment");
		int y = ++i; // pre increment ---- it will first increment and then assign to it.
		System.out.println("i = "+i);
		System.out.println("y = "+y);
		

	}

}
