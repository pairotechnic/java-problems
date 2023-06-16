package DataStructures;

//Java Program to Get the First Element from LinkedHashSet
//by converting it to an array or List
//Array is demonstrated below so do with List

//Importing generic java packages
import java.io.*;
import java.lang.*;
import java.util.*;

//Class
public class Question33 {
	// Main driver method
	public static void main(String[] args) {
		
		// Creating a LinkedHashMap object
		// Declaring object of Integer type
		LinkedHashSet<Integer> hashSet= new LinkedHashSet<Integer>();

		// Adding elements to LinkedHashMap
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(6);
		hashSet.add(8);

		// Condition check using isEmpty() method which
		// holds

		// True till there is a single element in an object
		// is remaining False, when there is no object left
		// or if initially there was no element added
		if (!hashSet.isEmpty()) {
			// Converting the above Map to an array
			Integer arr[] = new Integer[hashSet.size()];
			arr = hashSet.toArray(arr);

			// Accessing the first element by passing 0
			// as an argument which by default
			// accesses and prints out first element
			System.out.println("First element: " + arr[0]);
		}
	}
}

