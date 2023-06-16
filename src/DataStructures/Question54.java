package DataStructures;

//Java code to illustrate the remove() method
import java.util.*;

public class Question54 {
public static void main(String[] args) {
		
	// Creating an empty HashMap
	LinkedHashMap<Integer, String> hash_map = new LinkedHashMap<Integer, String>();

	// Mapping string values to int keys
	hash_map.put(10, "Hydrogen");
	hash_map.put(15, "Helium");
	hash_map.put(20, "Lithium");
	hash_map.put(25, "Beryllium");
	hash_map.put(30, "Boron");

	// get the values of the map
    Collection<String> values = hash_map.values();

    // print the values list
    System.out.println("values : " + values);
}
}

