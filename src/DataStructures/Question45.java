package DataStructures;

//Java Program to find
//Sublist in a List
import java.util.*;

public class Question45 {
	
	// Main Method
	public static void main(String[] argv)
	{

			ArrayList<Integer> arrlist = new ArrayList<Integer>();

			// Populating arrlist1
			arrlist.add(1);
			arrlist.add(4);
			arrlist.add(9);
			arrlist.add(25);
			arrlist.add(36);

			// Print arrlist
			System.out.println("Original arrlist: " + arrlist);

			// Getting the subList
			// using subList() method
			List<Integer> arrlist2 = arrlist.subList(2, 4);

			// Print the subList
			System.out.println("Sublist of arrlist: " + arrlist2);
		
	}
}

