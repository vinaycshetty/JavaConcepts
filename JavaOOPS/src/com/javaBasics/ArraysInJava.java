package com.javaBasics;

public class ArraysInJava {

	public static void main(String[] args) {
		// array is used to store similar type of data --- int,char,String, double 
		// array index start with 0 ... ie if 5 value is there in array the it will index 0 to 4
		// disadvantage of array is 
		
		//1. fixed value has to be assigned first like int[3] -- to overcome this we use dynamic array like arraylist, hasttable etc-- this will be seen in opps concept 
		//2. only similar data type can be stored --- to over come this we use object array.
		int a[] = new int[3]; // array of int type in variable a and can store 5 value
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println("length of array is "+a.length);
		//a[3]=40;// java.lang.ArrayIndexOutOfBoundsException: 3 as a[3] does not exist as we have declared value as 3 then 0 to 2 is valid
		// it will give runtime error
		
		System.out.println("*************");
		System.out.println("Printing value one by one -- array");
		
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println("*************");
		System.out.println("To Print all value at once use for loop --- array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("******************");
		
		System.out.println("To print object array values one by one");
		// object is a super class of all class in java.
		// in object array we can store different type of value like int, double,char,string,boolean together
		Object x[] =new Object[5];
		
		x[0] = "Vinay";
		x[1] = 'M';
		x[2] = 98.20;
		x[3] = 102;
		x[4] = true;
		
		System.out.println("Name is - "+x[0]);
		System.out.println("Gender is - "+x[1]);
		System.out.println("Percentage is - "+x[2]);
		System.out.println("Role no is - "+x[3]);
		System.out.println("Is he good boy - "+x[4]);
		
		System.out.println("******************");
		
		System.out.println("To print object array all values at a time using for loop");
		
		for(int j=0;j<x.length;j++) {
			System.out.println("Values of "+j+" is "+ x[j]);
		}
		
		
	}

}
