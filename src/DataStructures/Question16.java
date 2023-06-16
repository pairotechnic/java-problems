package DataStructures;

import java.util.*;

public class Question16 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>(); //create first list 
		
		list1.add(70); // add elements
		list1.add(30);
		list1.add(90);
		list1.add(20);
		list1.add(10);
		list1.add(80);
		
		System.out.println("Print list1 : " + list1); // print first list
		
		List<Integer> list2 = new ArrayList<Integer>(); //create second list 	
		
		list2 = list1.subList(1, 4);
		
		
		System.out.println("Print list2 : " + list2); // print second list
		
	}

}