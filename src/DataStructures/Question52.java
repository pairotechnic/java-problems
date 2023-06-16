package DataStructures;

//Java code to illustrate the remove() method
import java.util.*;

public class Question52 {
public static void main(String[] args) {
		
	// Creating an empty HashMap
	HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

	// Mapping string values to int keys
	hash_map.put(10, "Hydrogen");
	hash_map.put(15, "Helium");
	hash_map.put(20, "Lithium");
	hash_map.put(25, "Beryllium");
	hash_map.put(30, "Boron");

	// Displaying the HashMap
	System.out.println("Initial Mappings are: " + hash_map);

	hash_map.replace(25, "Carbon");
	
	// Displaying the new map
	System.out.println("\nNew map is: "+ hash_map);
}
}

