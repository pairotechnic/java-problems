package DataStructures;

import java.util.*;

public class Question25 {
	public static void main(String args[])
	{	
		// Get the ArrayList
		List<String> list = new ArrayList<String>(); 

		// Populate the ArrayList
		list.add("Apple"); 
		list.add("Cat");
		list.add("Fortune");
		list.add("Elephant");
		list.add("Banana");

		// Print the unsorted ArrayList
		System.out.println("Unsorted ArrayList: " + list); 

		// Sorting ArrayList in descending Order
		// using Collection.sort() method
		// by passing Collections.reverseOrder() as comparator
		Collections.sort(list, Collections.reverseOrder());

		// Print the sorted ArrayList
		System.out.println("Sorted ArrayList " + "in Descending order : "+ list);
	}
}
