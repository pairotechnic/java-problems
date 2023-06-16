package DataStructures;

//Java program to find the last
//element from LinkedHashSet

import java.util.*;

public class Question35 {
	public static void main(String[] args)
	{

		// New empty HashSet
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		// Add elements to set
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(50);
		set.add(20);

		Integer[] elements = new Integer[set.size()];

		// Convert LinkedHashSet to Array
		elements = set.toArray(elements);

		// Get the last element with the help of the index.
		int lastEle = elements[elements.length - 1];

		// Print the LinkedHashSet
		System.out.println("LinkedHashSet: " + set);

		// Print the last element of the LinkedHashSet
		System.out.println("Last element of LinkedHashSet: " + lastEle);
	}
}

