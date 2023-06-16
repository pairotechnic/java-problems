package DataStructures;

//Java Program to sort LinkedHashSet elements
//in descending order

//Importing java generic libraries
import java.util.*;
import java.io.*;

//Class
public class Question39 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating and Initializing LinkedHashSet
		Set<Integer> set = new LinkedHashSet<Integer>();

		// Adding elements to above LinkedHashSet
		// Custom inputs
		set.add(26);
		set.add(23);
		set.add(24);
		set.add(21);
		set.add(25);
		set.add(22);

		// TreeSet storing elements in descending order by
		// adding all elements of HashSet in reverse order
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());

		// Add all elements from LinkedHashSet to TreeSet
		ts.addAll(set);

		// Print all elements of TreeSet
		System.out.println("Elements in descending order : " + ts);
	}
}

