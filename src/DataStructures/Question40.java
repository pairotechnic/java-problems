package DataStructures;

//Java program to print the elements of LinkedHashSet

import java.util.*;
public class Question40 {
	public static void main(String args[])
	{
		// Creating an instance of LinkedHashSet
		LinkedHashSet<String> hs = new LinkedHashSet<>();

		// Adding elements to the LinkedHashSet
		hs.add("Hey");
		hs.add("How");
		hs.add("are");
		hs.add("You");

		// Printing
		System.out.println(hs);
	}
}

