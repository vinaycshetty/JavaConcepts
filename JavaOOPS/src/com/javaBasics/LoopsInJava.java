package com.javaBasics;

public class LoopsInJava {

	public static void main(String[] args) {
		
		// while loop
		// disadvantage of while loop is if you do not give incremental part it will run for infinite times
		
		int i=1;// Initialization 
		
		while(i<=5) {//condition given to loop
			System.out.println(i);
			i++; // incremental or decremental statement
		}
		System.out.println("**********************************");
		// do....while loop
		// in this loop statement will execute atleast once
		
		int x=1;//init
		do {
			System.out.println(x);
			x++;//incremental
		}while(x<=5);//condition
		
		System.out.println("**************************************");
		
		//for loop
		
		for(int b=1;b<=5;b++) {
			System.out.println(b);
		}
		
	}

}
