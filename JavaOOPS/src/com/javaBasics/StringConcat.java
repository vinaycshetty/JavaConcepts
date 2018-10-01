package com.javaBasics;

public class StringConcat {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		String c = "Vinay";
		String d = "Shetty";

		System.out.println(a+b);// it will add both int and give answer as 30
		System.out.println(c+d);// it will concat both String value and gives VinayShetty
		System.out.println(a+b+c+d);//it will add both int and concat with String gives 30VinayShetty
		System.out.println(c+a+d+b);// gives Vinay10Shetty20
		System.out.println(c+a+b+d);//gives Vinay1020Shetty
		System.out.println(c+d+a+b);//gives VinayShetty1020
		System.out.println(a+c+d+b);//gives 10VinayShetty20
		System.out.println(c+d+(a+b));// gives VinayShetty30
	}

}
