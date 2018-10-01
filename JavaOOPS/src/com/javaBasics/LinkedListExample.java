package com.javaBasics;

import java.io.IOException;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int ch, ch1, n, i;
		int l1, l2;
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		LinkedList<Integer> list5 = new LinkedList<Integer>();

		Scanner br = new Scanner(System.in);
		do {
			System.out.println("1:Add Elements");
			System.out.println("2:Intersection");
			System.out.println("3:Union");
			System.out.println("4:Concatenation");
			System.out.println("5:Display");
			System.out.println("6:Exit");
			System.out.println("Enter Choice:");
			ch = br.nextInt();
			switch (ch) {
			case 1:
				do {
					System.out.println("1:First LinkedList");
					System.out.println("2:Second LinkedList");
					System.out.println("3Main Menu");
					System.out.println("Enter Choice:");
					ch1 = br.nextInt();
					switch (ch1) {
					case 1:
						System.out.print("How many Number");
						n = br.nextInt();
						System.out.println("Enter Elements");
						for (i = 0; i < n; i++) {
							l1 = br.nextInt();
							list1.add(l1);
						}
						break;
					case 2:
						System.out.println("How many Number");
						n = br.nextInt();
						System.out.println("Enter Elements");
						for (i = 0; i < n; i++) {
							l2 = br.nextInt();
							list2.add(l2);
						}
						break;
					case 3:
						break;
					}
				} while (ch1 > 0 && ch1 < 3);
				break;

			case 2:
				for (i = 0; i < list1.size(); i++)
					list3.add(list1.get(i));
				list3.retainAll(list2);
				System.out.println("Intersection done...");
				break;

			case 3:
				for (i = 0; i < list1.size(); i++)
					list4.add(list1.get(i));
				for (i = 0; i < list2.size(); i++)
					list4.add(list2.get(i));
				System.out.println("Concatenation done...");
				break;
			case 4:
				for (i = 0; i < list1.size(); i++)
					list5.add(list1.get(i));
				for (i = 0; i < list2.size(); i++)
					if (!list1.contains(list2.get(i)))
						list5.add(list2.get(i));
				System.out.println("Unoin done...");
				break;
			case 5:
				System.out.println("LinkedList1:" + list1);
				System.out.println("LinkedList2:" + list2);
				System.out.println("Intersection:" + list3);
				System.out.println("Concatenation:" + list4);
				System.out.println("Union:" + list5);
				break;
			}
		} while (ch > 0 && ch < 6);
		br.close();
	}

}
