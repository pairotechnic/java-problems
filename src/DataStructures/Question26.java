package DataStructures;

import java.util.*;

public class Question26 {
	public static void main(String[] args) {
		
		// Create a empty hash set
		Set<String> h_set = new HashSet<String>();
		
		// use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        
        System.out.println("Original Hash Set: " + h_set);
        
        // Creating an Array
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array); // storing set elements in array
 
        // Displaying Array elements
        System.out.println("\nArray elements after copying set elements into the array printed below : \n");
        for(String element : new_array){
        	System.out.println(element);
        }
	}
}