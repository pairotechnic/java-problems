package DataStructures;

// Java program to Convert all LinkedHashMap values to a
// List

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Question56 {

	public static void main(String[] args)
	{

		// instance of linkedhashmap
		LinkedHashMap<Integer, Integer> lhmap = new LinkedHashMap<Integer, Integer>();

		// add mappings
		lhmap.put(1, 11);
		lhmap.put(2, 22);
		lhmap.put(3, 33);

		// convert values to a list
		List<Integer> listValues = new ArrayList<Integer>(lhmap.values());

		// print values
		System.out.println("List contains:");
		for (Integer value : listValues) {
			System.out.println(value);
		}
	}
}
