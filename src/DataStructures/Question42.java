package DataStructures;

//Java Program to Demonstrate Getting Values
//as an Enumeration of Hashtable class

import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;

//Main class
//EnumerationOnKeys
public class Question42 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an empty hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		// Inserting key-value pairs into hash table
		// using put() method
		ht.put(1, "Hydrogen");
		ht.put(2, "Helium");
		ht.put(3, "Lithium");

		// Now creating an Enumeration object
		// to read elements
		Enumeration e = ht.elements();

		// Condition holds true till there is
		// single key remaining

		// Printing elements of hashtable
		// using enumeration
		while (e.hasMoreElements()) {

			// Printing the current element
			System.out.println(e.nextElement());
		}
	}
}

