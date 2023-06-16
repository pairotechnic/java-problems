package DataStructures;

//Java Program to Iterate through linkedHashset
//Using the for-each loop

import java.io.*;
import java.util.LinkedHashSet;

public class Question38 {
	public static void main(String[] args)
	{

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet
		set.add("Hydrogen");
		set.add("Helium");
		set.add("Lithium");

		// iterating LinkedHashSet using enhanced for loop
		for (String itr : set) {
			System.out.println(itr);
		}
	}
}

