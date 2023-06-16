package DataStructures;

import java.util.*;

public class Question23 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>(); // Create a HashMap of <Key,Value> of <String,String> type

		map.put("A", "Zebra"); // Adding elements
		map.put("B", "Xylophone");
		map.put("C", "Water");
		map.put("D", "Vase");
		map.put("E", "Umbrella");
		
		System.out.println("Printing HashMap one element at a time =>\n");
		
		for(Map.Entry m : map.entrySet()) { // iterating over map
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
	}

}