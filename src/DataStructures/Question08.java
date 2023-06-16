package DataStructures;

import java.util.*;

public class Question08 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>(6); //create first list 
		// Why can't I write List<Integer> instead of ArrayList<Integer> on LHS
		
		list1.add(70); // add elements
		list1.add(30);
		list1.add(90);
		list1.add(20);
		list1.add(10);
		list1.add(80);
		
		System.out.println("Print list1 : " + list1); // print first list
		
		List<Integer> list2 = new ArrayList<Integer>(6); //create second list 	
		
		list2.add(10); // add elements
		list2.add(20);
		list2.add(30);
		list2.add(50);
		list2.add(10);
		list2.add(90);
		
		System.out.println("Print list2 : " + list2); // print second list
		
		boolean listComparison = list1.equals(list2);
		
		System.out.println("Whether the 2 lists are equal : " + listComparison);
		
	}

}