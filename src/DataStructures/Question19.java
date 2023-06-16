package DataStructures;

import java.util.*;

public class Question19 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //create first list 
		
		list1.add(70); // add elements
		list1.add(30);
		list1.add(90);
		list1.add(20);
		list1.add(10);
		list1.add(80);
		
		System.out.println("Print list1 : " + list1); // print first list
		
		list1.trimToSize(); // excess size trimmed to fit current list
		
//		System.out.println("Print list after trim to size : " + list1);
//		
//		list1.add(120);
		
		System.out.println("Print list1 : " + list1); // print first list
		
	}

}