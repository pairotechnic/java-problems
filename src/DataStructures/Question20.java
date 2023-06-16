package DataStructures;

import java.util.*;

public class Question20 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //create first list 
		
		list1.add(70); // add elements
		list1.add(30);
		list1.add(90);
		list1.add(20);
		list1.add(10);
		list1.add(80);
		
		System.out.println("Print list1 : " + list1); // print first list
		
		int no_of_elements = list1.size();
		
		System.out.println("\nPrinting elements one by one by index : ");
		for (int index = 0; index < no_of_elements; index++) // print elements in list 
			System.out.println(list1.get(index));
		
	}

}